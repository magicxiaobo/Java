import java.io.*;
public class TestPrintStream1 {
	public static void main (String [] args) {
		PrintStream ps = null;
		try {
			FileOutputStream fos = new FileOutputStream("e:/share/bak/log.dat");
			ps = new PrintStream(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (ps != null) {
			System.setOut(ps);		//set the system out at ps
		}
		int ln = 0;
		for (char c = 0; c <= 6000; c++) {
			System.out.print(c + " ");
			ln++;
			if (ln >= 100) {
				System.out.println(); ln = 0;
			}
		}
	}
}