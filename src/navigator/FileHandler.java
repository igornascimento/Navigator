package navigator;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileHandler {

	String source;
	Integer numLines = 0;
	
	public FileHandler(String source) {
		this.source = source;
	}
	
	public void readFile() throws Exception {
		try {
			FileReader file = new FileReader(source);
			BufferedReader buffer = new BufferedReader(file);
			
			//reads the file until receives the null value (end of the file)
			String line = buffer.readLine();
			
			while (line != null) {
				System.out.printf("%s\n", line);
				line = buffer.readLine();
				this.numLines++;
			}
			
			
		} catch (Exception e) {
			throw new Exception("Cannot read the file.");
		}
	}
	
}
