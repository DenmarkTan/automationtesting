package directoriesexample;
import java.io.File;
import java.io.FilenameFilter;

public class DirectoriesExample {
	public static void main(String[] args) {
		
		//create filter
		FilenameFilter filter = (file, fileName) -> {
			return fileName.contains(".");
		};
		// filter file
		String[] contents = new File(".").list(filter);
		//String[] contents = new File(".").list();
		for(String file: contents) {
			System.out.println(file);
		}
		//created my Directory
		new File("myDirectory").mkdir();
	}
}
