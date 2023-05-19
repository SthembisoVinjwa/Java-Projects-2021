public class Game {
	public static void main(String[] args) {
		boolean solved = false;
		int currPole = 0;
		int prePole = 0;
		int numOfMoves = 0;
		
		System.out.println("Enter number of disks: ");
		int numOfDisks = StdIn.readInt();
		while (numOfDisks > 6 || numOfDisks < 3) {
			System.out.println("Number of disks should be between 3 and 6 included respectively. Re-enter number of disks: ");
			numOfDisks = StdIn.readInt();
		}
		StdDraw.setCanvasSize(500, 500);
		StdDraw.setXscale(0, 500);
		StdDraw.setYscale(0, 500);
		
		Pole[] pole = new Pole[3];
		Pole temp = new Pole(numOfDisks);
		
		for (int i = 0; i < pole.length; i++) {
			pole[i] = new Pole(numOfDisks);
		}
		
		Pole.initializeDisks(pole, numOfDisks);
		
		StdDraw.enableDoubleBuffering();
		
		Graphics.drawBackround();
		
		while (!solved) {
			int pX = 90;
			switch (currPole) {
			case 0:
				pX = 90;
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledCircle(pX, 50, 20);
				break;
			case 1:
				pX = 250;
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledCircle(pX, 50, 20);
				break;
			case 2:
				pX = 410;
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledCircle(pX, 50, 20);
				break;
			}
			
			if (temp.getNumOfDisks() > 0) {
				Disk tempDisk = temp.outDisk();
				StdDraw.setPenColor(tempDisk.getColor());
				StdDraw.filledRectangle(pX, 375, tempDisk.getWidth(), 10);
				temp.inDisk(tempDisk);
			}
			
			Graphics.drawDisks(pole[0], 0, numOfDisks);
			Graphics.drawDisks(pole[1], 1, numOfDisks);
			Graphics.drawDisks(pole[2], 2, numOfDisks);
			
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.text(400, 410, "Number of Moves: " + numOfMoves);
			
			StdDraw.show();
			
			while (!StdDraw.hasNextKeyTyped()) {
				//wait
			}
			
			char move = StdDraw.nextKeyTyped();
			
			if (move == 'a') {
				//Left
				if (currPole == 0) {
					currPole = 2;
				} else {
					currPole--;
				}
				
			} else if (move == 'd') {
				//Right
				if (currPole == 2) {
					currPole = 0;
				} else {
					currPole++;
				}
				
			}
			
			Graphics.drawBackround();	
			
			StdDraw.show();
			
			if (move == 'o') { // Take out disk from current pole
				if (pole[currPole].getNumOfDisks() > 0 && temp.getNumOfDisks() == 0) {
					temp.inDisk(pole[currPole].outDisk());
					prePole = currPole;
				}
			} else if (move == 'i') { // Insert disk in current pole
				if (temp.getNumOfDisks() > 0) {
					if (pole[currPole].getNumOfDisks() > 0) {
						if (pole[currPole].lastDiskSize() > temp.lastDiskSize()) {
							pole[currPole].inDisk(temp.outDisk());
							if (prePole != currPole) {
								numOfMoves++;
							}
						}
					} else {
						pole[currPole].inDisk(temp.outDisk());
						if (prePole != currPole) {
							numOfMoves++;
						}
					}
				}
			}

			// Check for win
			if (pole[2].getNumOfDisks() == numOfDisks) {
				solved = true;
				System.out.println();
				System.out.println("Solved in " + numOfMoves + " moves!");
				System.exit(0);
			}
			
		}
		
	}
	
}