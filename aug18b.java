package August;

import java.io.File;

public class aug18b {

	public static void main(String[] args) {
		File fl = new File("MyRecord.txt");
		if (fl.delete()) {
			System.out.println("Deleted your file: " + fl.getName());
		} else {
			System.out.println("Sorry power is out ,failed to delete your file.");
		}

	}

}
