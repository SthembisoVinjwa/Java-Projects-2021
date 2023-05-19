
public class BouncingBall {
	public static void main(String[] args) {
		double xSpeed = 1.5;
		double ySpeed = 1.3;
		
		double xB = 50.0;
		double yB = 200.5;
		
		StdDraw.setXscale(0, 600);
		StdDraw.setYscale(0, 600);
		
		StdDraw.enableDoubleBuffering();
		
		while (true) {
			if (xB + 30 > 600 || xB - 30 < 0) {
				xSpeed = -xSpeed;
			}
			if (yB + 30 > 600 || yB - 30 < 0) {
				ySpeed = -ySpeed;
			}
			
			
			StdDraw.clear(StdDraw.BLACK);
			
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.filledCircle(xB += xSpeed, yB += ySpeed, 30);
			
			StdDraw.show();
			StdDraw.pause(5);
		}
		
	}
}
