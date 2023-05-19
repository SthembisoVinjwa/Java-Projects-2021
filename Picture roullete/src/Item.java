public class Item {
	private int id;
	private int value;
	private String name;
	private String filepath;
	
	public Item(int ID, int val, String nam, String file) {
		id = ID;
		value = val;
		name = nam;
		filepath = file;
	}
	
	public int getID() {
		return id;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFilePath() {
		return filepath;
	}

}
