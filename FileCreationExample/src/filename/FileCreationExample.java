package filename;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {
	public static void main(String[] args) {
		//creating new file
		File myFile = new File("C:\\Users\\132577\\eclipse-workspace\\SynchronizationExample\\myFile.txt");
		try {
			myFile.createNewFile();
		//checking if created new file, it will return false
			boolean fileCreated = myFile.createNewFile();
			System.out.println(fileCreated);
		} catch(IOException ioe) {
			
		}
	}
}
