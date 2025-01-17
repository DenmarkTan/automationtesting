package bufferedreaderexample;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class TryWithResources {
	public static void main(String[] args) {
		
		try (BufferedReader reader = new BufferedReader(new StringReader("Hello World!"));
				StringWriter writer = new StringWriter();){
			
			writer.write(reader.readLine());
			System.out.println(writer.toString());
		} catch(IOException ioe) {
			
		}
		
	}
}
