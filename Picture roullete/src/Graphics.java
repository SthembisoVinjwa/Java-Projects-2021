import java.awt.Font;

public class Graphics {
	public static void drawBackround() {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(0.005);
		StdDraw.rectangle(400, 350, 300, 200);
		StdDraw.rectangle(400, 350, 200, 120);
		
		StdDraw.rectangle(400, 80, 200, 30);
		StdDraw.rectangle(439, 80, 33, 30);
		StdDraw.rectangle(505, 80, 33, 30);
		StdDraw.rectangle(373, 80, 33, 30);
		StdDraw.rectangle(307, 80, 33, 30);
		StdDraw.rectangle(400, 32, 200, 10);
		StdDraw.rectangle(439, 32, 33, 10);
		StdDraw.rectangle(505, 32, 33, 10);
		StdDraw.rectangle(373, 32, 33, 10);
		StdDraw.rectangle(307, 32, 33, 10);
		StdDraw.circle(140, 80, 30);
		StdDraw.circle(660, 80, 30);
		
		StdDraw.rectangle(150, 510, 50, 40);
		StdDraw.rectangle(150, 350, 50, 40);
		StdDraw.rectangle(150, 190, 50, 40);
		StdDraw.rectangle(650, 510, 50, 40);
		StdDraw.rectangle(650, 350, 50, 40);
		StdDraw.rectangle(650, 190, 50, 40);
		StdDraw.rectangle(350, 510, 50, 40);
		StdDraw.rectangle(450, 510, 50, 40);
		StdDraw.rectangle(350, 190, 50, 40);
		StdDraw.rectangle(450, 190, 50, 40);
	}
	
	public static Item[] loadItems() {
		Item[] items = new Item[18];
		items[0] = new Item(0, 0, "Thought", "Thought.png");
		items[1] = new Item(1, 450, "Diamond", "TwoSmallDiamond.png");
		items[2] = new Item(2, 200, "WitchHat", "WitchHat.png");
		items[3] = new Item(3, 750, "Diamond", "Diamond.png");
		items[4] = new Item(4, 1000, "Lightning", "Lightning.png");
		items[5] = new Item(5, 500, "Love", "Love.png");
		items[6] = new Item(6, 100, "WitchHat", "TwoSmallWitchHat.png");
		items[7] = new Item(7, 600, "Melon", "TwoHalfMelon.png");
		items[8] = new Item(8, 300, "Melon", "TwoHalfMelon.png");
		items[9] = new Item(9, 0, "Thought", "Thought.png");
		items[10] = new Item(10, 500, "Love", "Love.png");
		items[11] = new Item(11, 200, "WitchHat", "WitchHat.png");
		items[12] = new Item(12, 100, "WitchHat", "TwoSmallWitchHat.png");
		items[13] = new Item(13, 1000, "Lightning", "Lightning.png");
		items[14] = new Item(14, 450, "Diamond", "TwoSmallDiamond.png");
		items[15] = new Item(15, 500, "Love", "Love.png");
		items[16] = new Item(16, 150, "TwoStars", "TwoStarsSmall.png");
		items[17] = new Item(17, 300, "TwoStars", "TwoStarsSmall.png");
		
		return items;
	}
	
	public static void drawItems(Item[] items) {
		StdDraw.picture(150, 355, items[0].getFilePath());
		StdDraw.picture(150, 435, items[1].getFilePath());
		StdDraw.picture(150, 515, items[2].getFilePath());
		StdDraw.picture(250, 515, items[3].getFilePath());
		StdDraw.picture(350, 515, items[4].getFilePath());
		StdDraw.picture(455, 515, items[5].getFilePath());
		StdDraw.picture(550, 512, items[6].getFilePath());
		StdDraw.picture(652, 515, items[7].getFilePath());
		StdDraw.picture(650, 435, items[8].getFilePath());
		StdDraw.picture(652, 355, items[9].getFilePath());
		StdDraw.picture(655, 275, items[10].getFilePath());
		StdDraw.picture(655, 195, items[11].getFilePath());
		StdDraw.picture(550, 192, items[12].getFilePath());
		StdDraw.picture(255, 195, items[13].getFilePath());
		StdDraw.picture(150, 195, items[14].getFilePath());
		StdDraw.picture(150, 275, items[15].getFilePath());
		StdDraw.picture(352, 195, items[16].getFilePath());
		StdDraw.picture(452, 195, items[17].getFilePath());
	}
	
	public static void showBalance(int balance) {
		StdDraw.setFont(new Font("Calibri", Font.BOLD, 40));
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(400, 350, "Zaka: R" + balance);
	}
	
	public static void selectedItems(int[] itemCount) {
		StdDraw.setFont(new Font("Calibri", Font.BOLD, 20));
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(237, 30, Integer.toString(itemCount[0]));
		StdDraw.text(307, 30, Integer.toString(itemCount[1]));
		StdDraw.text(373, 30, Integer.toString(itemCount[2]));
		StdDraw.text(440, 30, Integer.toString(itemCount[3]));
		StdDraw.text(505, 30, Integer.toString(itemCount[4]));
		StdDraw.text(570, 30, Integer.toString(itemCount[5]));
	}
	
	public static void drawLabels() {
		StdDraw.setFont(new Font("Calibri", Font.BOLD, 30));
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(140, 30, "Patela");
		StdDraw.text(660, 30, "Dlala");
	}
	
	public static void drawButtons() {
		StdDraw.picture(237, 80, "1.png");
		StdDraw.picture(307, 80, "2.png");
		StdDraw.picture(376, 80, "3.png");
		StdDraw.picture(441, 80, "4.png");
		StdDraw.picture(508, 80, "5.png");
		StdDraw.picture(570, 80, "6.png");
	}
}
