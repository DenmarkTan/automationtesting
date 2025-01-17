package filecopyexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Logger;

public class FileCopyExample {
	public static void main(String[] args) {
		Path source = Paths.get("C:\\Users\\132577\\eclipse-workspace\\BufferedReaderExample\\example.txt");
		Path dest = Paths.get("C:\\Users\\132577\\eclipse-workspace\\FileCopyExample\\new.txt");
		try {
			Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException ex){
			ex.printStackTrace();
		}
	}

}
