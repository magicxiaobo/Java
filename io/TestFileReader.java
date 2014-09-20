import java.io.*;
public class TestFileReader {
	public static void main (String[] args) {
		FileReader in = null;
		int c = 0;
		try {
			in = new FileReader("e:/share/java2/io/TestFileReader.java");
			while ( (c = in.read()) != -1 ) {
				System.out.print( (char)c );
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.print("File not found!");
		} catch (IOException e) {
			System.out.print("File read error!");
		}
	}
}