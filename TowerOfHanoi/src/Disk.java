import java.awt.Color;

public class Disk {
	private int size;
	private int width;
	private Color color;
	
	public Disk(int diskSize) {
		size = diskSize;
		
		switch (size) {
			case 1 : 
				color = new Color(0, 0, 255);
				width = 10;
				break;
			case 2 : 
				color = new Color(155, 100, 0);
				width = 20;
				break;
			case 3 : 
				color = new Color(125, 40, 233);
				width = 30;
				break;
			case 4 : 
				color = new Color(233, 40, 100);
				width = 40;
				break;
			case 5 : 
				color = new Color(0, 255, 0);
				width = 50;
				break;
			case 6 : 
				color = new Color(75, 2, 38);
				width = 60;
				break;
		}
		
	}
	
	public int getDiskSize() {
		return size;
	}
	
	public Color getColor() {
		return color;
	}
	
	public int getWidth() {
		return width;
	}
	
}