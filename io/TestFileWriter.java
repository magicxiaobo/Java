import java.io.*;
public class TestFileWriter {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("e:/share/bak/unicode.dat");
			for (int c = 0; c <= 5000; c++) {
				fw.write(c);
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.print("File Copy Error!");
			System.exit(-1);
		}
	}
}