import java.io.*;

public class TestFileOutputStream {
	public static void main(String[] args) {
		int b = 0;
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("e:/share/java2/HelloWorld.java");
			out = new FileOutputStream("e:/share/java2/HW.java");
			while( (b = in.read()) != -1 ) {
				out.write(b);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.print("File not found!"); System.exit(-1);
		} catch (IOException e) {
			System.out.print("File copy error!"); System.exit(-1);
		}
		System.out.print("Fild copy done!");
	}
}