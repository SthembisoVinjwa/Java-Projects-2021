import java.awt.Color;
import java.awt.Font;

public class Graphics {
	
	public static void initializeWindow() {
		StdDraw.setCanvasSize(600, 600);
		StdDraw.setXscale(0, 600);
		StdDraw.setYscale(0, 600);
		StdDraw.enableDoubleBuffering();
	}
	
	public static void drawBall(double x, double y) {
		StdDraw.setPenColor(StdDraw.DARK_GRAY);
		StdDraw.filledCircle(x, y, 15);
	}
	
	public static void drawPlayer(double x, double y, Color c) {
		StdDraw.setPenColor(c);
		StdDraw.filledRectangle(x, y, 70, 10);
	}
	
	public static void drawBackround() {
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(300, 10, 300, 10);
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledRectangle(300, 590, 300, 10);
	}
	
	public static void drawScore(int p1Score, int p2Score, String player1, String player2) {
		StdDraw.setPenColor(StdDraw.DARK_GRAY);
		StdDraw.setFont(new Font("Comic Sans MS", 0, 30));
		StdDraw.text(100, 50, player1 + ":  " + p1Score);
		StdDraw.text(100, 550, player2 + ":  " + p2Score);
	}

}
