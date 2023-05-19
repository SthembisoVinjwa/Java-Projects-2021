public class Graphics {
	public static void drawBackround() {
		StdDraw.clear();
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(0.02);
		StdDraw.text(250, 480, "TOWER OF HANOI");
		StdDraw.text(250, 455, "BY STHE");
		StdDraw.setPenRadius(0.002);
		StdDraw.setPenColor(StdDraw.GRAY);
		StdDraw.filledRectangle(250, 50, 250, 50);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(250, 90, 250, 10);
		
		// Pole 0
		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.filledRectangle(90, 220, 10, 120);

		// Pole 1
		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.filledRectangle(250, 220, 10, 120);

		// Pole 2
		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.filledRectangle(410, 220, 10, 120);
	}
	
	public static void drawDisks(Pole pole, int poleNumber, int numOfDisks) {
		int totalDisks = pole.getNumOfDisks();
		Disk[] tempDisks = new Disk[totalDisks];
		
		int xPole = 0;
		switch (poleNumber) {
			case 1 :
				xPole = 160;
				break;
			case 2 :
				xPole = 320;
				break;
		}
		
		if (totalDisks > 0) {
			int lastI = 0;

			for (int i = 0; i < totalDisks; i++) {
				lastI = i;
				tempDisks[i] = pole.outDisk();
			}
		
			for (int i = lastI; i >= 0; i--) {
				StdDraw.setPenColor(tempDisks[i].getColor());
				StdDraw.filledRectangle(90 + xPole, (110 + (lastI-i)*20), tempDisks[i].getWidth(), 10);
				pole.inDisk(tempDisks[i]);
			}
			
		}
	}
	
}