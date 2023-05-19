import java.awt.event.KeyEvent;

public class Game {
	public static void main(String[] args) {
		double bX = 300, bY = 300;
		double bYSpeed = 2.5, bXSpeed = 2;
		
		double p1X = 300, p1Y = 40;
		double p2X = 300, p2Y = 560;
		
		int p1Score = 0, p2Score = 0;
		
		String player1 = "";
		String player2 = "";
		
		boolean start = false;
		
		StdOut.println("Player 1 name: ");
		player1 = StdIn.readLine();
		StdOut.println("Player 2 name: ");
		player2 = StdIn.readLine();
		
		StdOut.println();
		StdOut.println("Press Space to start Playing.....");
		
		Graphics.initializeWindow();
		Graphics.drawBall(bX, bY);
		StdDraw.show();
		
		while (true) {
			StdDraw.clear();
			
			if (StdDraw.isKeyPressed(KeyEvent.VK_SPACE)) start = true;
			
			if (bX + bXSpeed >= 590) {
				bXSpeed = -bXSpeed;
			} else if (bX + bXSpeed <= 10) {
				bXSpeed = -bXSpeed;
			}

			// collision detection
			if (bX >= p1X - 80 && bX <= p1X + 80) {
				if (bY <= p1Y + 25) {
					bYSpeed = -bYSpeed;
				}
			}

			if (bX >= p2X - 80 && bX <= p2X + 80) {
				if (bY >= p2Y - 25) {
					bYSpeed = -bYSpeed;
				}
			}

			if (bY > 600) {
				p1Score++;
			    bX = p2X;
			    bY = p2Y - 25;
			    start = false;
			} else if (bY < 0) {
				p2Score++;
				bX = p1X;
				bY = p1Y + 25;
				start = false;
			}
			
			// Bottom Player
			if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
				if (p1X + 2 < 530) {
					p1X += 2;
				}
			} else if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
				if (p1X - 2 > 70) {
					p1X -= 2;
				}
			}
			
			// Top Player
			if (StdDraw.isKeyPressed(KeyEvent.VK_D)) {
				if (p2X + 2 < 530) {
					p2X += 2;
				}
			} else if (StdDraw.isKeyPressed(KeyEvent.VK_A)) {
				if (p2X - 2 > 70) {
					p2X -= 2;
				}
			}
			
			Graphics.drawBackround();
			Graphics.drawScore(p1Score, p2Score, player1, player2);
			Graphics.drawPlayer(p1X, p1Y, StdDraw.RED);
			Graphics.drawPlayer(p2X, p2Y, StdDraw.GREEN);
			
			if (start == true) {
				bY += bYSpeed;
				bX += bXSpeed;
			}
			
			Graphics.drawBall(bX, bY);
			
			StdDraw.show();
			StdDraw.pause(10);
		}
		
	}
	
}
