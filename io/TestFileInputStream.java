import java.io.*;

public class TestFileInputStream {
	public static void main (String[] args) {
		FileInputStream in = null;
		int b = 0;
		try {
			in = new FileInputStream("e:/share/java2/ArrayParse.java");
		} catch (FileNotFoundException e) {
			System.out.print("File Not Found!");
			System.exit(-1);
		}

		try {
			long num = 0;
			while((b = in.read()) != -1) {
				System.out.print((char)b);
				num++;
			} 
			System.out.print("Hava read " + num + " bytes");
			System.exit(-1);
		} catch (IOException e) {
			System.out.print("File read error!");
			System.exit(-1);
		}
	}
}