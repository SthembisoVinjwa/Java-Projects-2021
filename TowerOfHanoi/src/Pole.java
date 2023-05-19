public class Pole {
	private Disk[] disk;
	private int diskIndex = 0;
	
	public Pole(int numOfDisks) {
		disk = new Disk[numOfDisks];
	}
	
	public int getNumOfDisks() {
		int a = 0;
		for (int i = 0; i < disk.length; i++) {
			if (disk[i] != null) a++;
		}
		return a;
	}
	
	public void inDisk(Disk newDisk) {
		disk[diskIndex++] = newDisk;
	}
	
	public Disk outDisk() {
		Disk out = disk[diskIndex-1];
		disk[--diskIndex] = null;
		return out;
	}
	
	public int lastDiskSize() {
		return disk[diskIndex-1].getDiskSize();
	}
	
	public void printDiskSizes() {
		for (int i = 0; i < disk.length; i++) {
			if (disk[i] != null) System.out.println(disk[i].getDiskSize());
		}
	}
	
	public static void initializeDisks(Pole[] pole, int numOfDisks) {
		for (int i = numOfDisks; i >= 1; i--) {
			pole[0].inDisk(new Disk(i));
		}
	}
	
	public static void printPoles(Pole[] pole) {
		for (int i = 0; i < pole.length; i++) {
			System.out.println("Pole " + i + " : ");
			pole[i].printDiskSizes();
		}
	}
	
}