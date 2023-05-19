import java.awt.Color;

public class simulator {
	
	public static void simulate(int[] fGroup, int[] lGroup, int a, int t) {
		int r[] = new int[18];
	
		int f = 0;
		int l = 0;
		
		for (int i = 0; i <= 17; i++) {
			r[i] = i;
		}
		
		int y = a;
		int last = 0;
		
		for (int j = a; j <= a + 18*2; j++) {
			if (y == 18) y = 0;
			fGroup[f] = r[y];
			if (j == a + 18*2) last = r[y];
			y++;
			f++;
		}
		
		for (int i = f; i < fGroup.length; i++) {
			fGroup[i] = -1;
		}
		
		y = last+1;
		if (last > t) {
			for (int j = last+1; j <= last + 18; j++) {
				if (y == 18) y = 0;
				lGroup[l] = r[y];
				if (r[y] == t) break;
				y++;
				l++;
				
			}
		} else if (last <= t) {
			for (int j = last+1; j <= last + 18*18; j++) {
				if (y == 18) y = 0;
				lGroup[l] = r[y];
				if (r[y] == t && j > 15) break;
				y++;
				l++;
			}
		}
		
		for (int i = l+1; i < fGroup.length; i++) {
			lGroup[i] = -1;
		}
		
	}
	
	public static void start(Item[] items, int[] itemCount, int prev, int target, int balance) {
		Color c = new Color(255, 0, 0, 70);
		double x = 0, y = 0;
		int a = 0;
		int slowDown = 1;
		int slowSpeed = 1;
		
		switch (prev) {
			case 0 :
				x = 150;
				y = 350;
				break;
			case 1 :
				x = 150;
				y = 430;
				break;
			case 2 :
				x = 150;
				y = 510;
				break;
			case 3 :
				x = 250;
				y = 510;
				break;
			case 4 :
				x = 350;
				y = 510;
				break;
			case 5 :
				x = 450;
				y = 510;
				break;
			case 6 :
				x = 550;
				y = 510;
				break;
			case 7 :
				x = 650;
				y = 510;
				break;	
			case 8 :
				x = 650;
				y = 430;
				break;
			case 9 :
				x = 650;
				y = 350;
				break;	
			case 10 :
				x = 650;
				y = 270;
				break;
			case 11 :
				x = 650;
				y = 190;
				break;
			case 12 :
				x = 550;
				y = 190;
				break;
			case 13 :
				x = 450;
				y = 190;
				break;
			case 14 :
				x = 350;
				y = 190;
				break;
			case 15 :
				x = 250;
				y = 190;
				break;
			case 16 :
				x = 150;
				y = 190;
				break;
			case 17 :
				x = 150;
				y = 280;
				break;	
		}
		
		double xSpeed = 100;
		double ySpeed = 80;
		
		int[] fGroup = new int[prev+18*2+1];
		int[] lGroup = new int[prev+18*2+1];
		
		simulator.simulate(fGroup, lGroup, prev, target);
		
		for (int i = 0; i < fGroup.length; i++) {
			StdDraw.clear();
			Graphics.drawItems(items);
			Graphics.drawBackround();
			Graphics.drawLabels();
			Graphics.drawButtons();
			Graphics.selectedItems(itemCount);
			Graphics.showBalance(balance);
			
			StdDraw.setPenColor(c);
			
			if (fGroup[i] >= 0 && fGroup[i] <= 2 || fGroup[i] == 17) {
				if (a != 0) {
					y += ySpeed;
				}
				StdDraw.filledRectangle(x, y, 50, 40);
			}
			
			if (fGroup[i] >= 3 && fGroup[i] <= 7) {
				if (a != 0) {
					x += xSpeed;
				}
				StdDraw.filledRectangle(x, y, 50, 40);
			}
			
			if (fGroup[i] >= 8 && fGroup[i] <= 11) {
				if (a != 0) {
					y -= ySpeed;
				}
				StdDraw.filledRectangle(x, y, 50, 40);
			}
			
			if (fGroup[i] >= 12 && fGroup[i] <= 16) {
				if (a != 0) {
					x -= xSpeed;
				}
				StdDraw.filledRectangle(x, y, 50, 40);
			}
			
			a++;
			StdDraw.show();
			StdDraw.pause(50);
		}
		
		for (int i = 0; i < lGroup.length; i++) {
			if (lGroup[i] != -1) {
				StdDraw.clear();
				Graphics.drawItems(items);
				Graphics.drawBackround();
			}
			Graphics.drawLabels();
			Graphics.drawButtons();
			Graphics.selectedItems(itemCount);
			Graphics.showBalance(balance);
			StdDraw.setPenColor(c);
			
			if (lGroup[i] >= 0 && lGroup[i] <= 2 || lGroup[i] == 17) {
				if (a != 0) {
					y += ySpeed;
				}
				StdDraw.filledRectangle(x, y, 50, 40);
			}
			
			if (lGroup[i] >= 3 && lGroup[i] <= 7) {
				if (a != 0) {
					x += xSpeed;
				}
				StdDraw.filledRectangle(x, y, 50, 40);
			}
			
			if (lGroup[i] >= 8 && lGroup[i] <= 11) {
				if (a != 0) {
					y -= ySpeed;
				}
				StdDraw.filledRectangle(x, y, 50, 40);
			}
			
			if (lGroup[i] >= 12 && lGroup[i] <= 16) {
				if (a != 0) {
					x -= xSpeed;
				}
				StdDraw.filledRectangle(x, y, 50, 40);
			}
			
			a++;
			slowDown++;
			if (slowDown%13 == 0) slowSpeed++;
			StdDraw.show();
			StdDraw.pause(50*slowSpeed);
		}
		
	}

}
