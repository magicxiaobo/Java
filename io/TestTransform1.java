import java.io.*;
public class TestTransform1 {
	public static void main(String[] args) {
		try {
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e:/share/bak/char.txt"));
			osw.write("appleibmhp");
			System.out.println(osw.getEncoding());
			osw.close();

			osw = new OutputStreamWriter(new FileOutputStream("e:/share/bak/char.txt", true), "IOS8859_1");
			osw.write("appleibmhp");
			System.out.println(osw.getEncoding());
			osw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}