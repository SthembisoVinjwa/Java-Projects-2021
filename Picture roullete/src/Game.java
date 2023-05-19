import java.awt.Font;

public class Game {
	
	public static void main(String[] args) {
		int balance = 100;
		boolean start = false;
		
		StdDraw.setCanvasSize(800, 600);
		StdDraw.setXscale(0, 800);
		StdDraw.setYscale(0, 600);
		
		Item[] items = Graphics.loadItems();
		int[] itemCount = new int[6];
		
		StdDraw.enableDoubleBuffering();
	
		StdDraw.clear();
		Graphics.drawItems(items);
		Graphics.drawBackround();
		Graphics.drawButtons();
		Graphics.drawLabels();
		Graphics.selectedItems(itemCount);
		Graphics.showBalance(balance);
		StdDraw.show();
		
		int prev = 0;
		
		while (balance > 0) {
			while (start == false) {
				if (StdDraw.mouseX() > 202 && StdDraw.mouseX() < 272 && StdDraw.mouseY() > 52 && StdDraw.mouseY() < 108) {
					if (StdDraw.isMousePressed()) {
						StdDraw.pause(300);
						if (balance >= 10) {
							itemCount[0]++;
							balance -= 10;
						}	
					}
				}
				if (StdDraw.mouseX() > 275 && StdDraw.mouseX() < 339 && StdDraw.mouseY() > 52 && StdDraw.mouseY() < 108) {
					if (StdDraw.isMousePressed()) {
						StdDraw.pause(300);
						if (balance >= 10) {
							itemCount[1]++;
							balance -= 10;
						}	
					}
				}
				if (StdDraw.mouseX() > 342 && StdDraw.mouseX() < 407 && StdDraw.mouseY() > 52 && StdDraw.mouseY() < 108) {
					if (StdDraw.isMousePressed()) {
						StdDraw.pause(300);
						if (balance >= 10) {
							itemCount[2]++;
							balance -= 10;
						}	
					}
				}
				if (StdDraw.mouseX() > 408 && StdDraw.mouseX() < 472 && StdDraw.mouseY() > 52 && StdDraw.mouseY() < 108) {
					if (StdDraw.isMousePressed()) {
						StdDraw.pause(300);
						if (balance >= 10) {
							itemCount[3]++;
							balance -= 10;
						}	
					}
				}
				if (StdDraw.mouseX() > 474 && StdDraw.mouseX() < 537 && StdDraw.mouseY() > 52 && StdDraw.mouseY() < 108) {
					if (StdDraw.isMousePressed()) {
						StdDraw.pause(300);
						if (balance >= 10) {
							itemCount[4]++;
							balance -= 10;
						}	
					}
				}
				if (StdDraw.mouseX() > 539 && StdDraw.mouseX() < 599&& StdDraw.mouseY() > 52 && StdDraw.mouseY() < 108) {
					if (StdDraw.isMousePressed()) {
						StdDraw.pause(300);
						if (balance >= 10) {
							itemCount[5]++;
							balance -= 10;
						}	
					}
				}
				
				if (StdDraw.mouseX() > 628 && StdDraw.mouseX() < 690 && StdDraw.mouseY() > 57 && StdDraw.mouseY() < 103) {
					if (StdDraw.isMousePressed()) {
						StdDraw.pause(300);
						start = true;
					}
				}
				
				StdDraw.clear();
				Graphics.drawItems(items);
				Graphics.drawBackround();
				Graphics.drawButtons();
				Graphics.drawLabels();
				Graphics.selectedItems(itemCount);
				Graphics.showBalance(balance);
				StdDraw.show();
			}
			
			int curr = (int) (Math.random()*18);
		
			simulator.start(items, itemCount, prev, curr, balance);
			
			prev = curr;
		}
		
	}
}
