import java.io.*;

public class TestEx {
	public static void main(String[] args){
		try {
			TestEx ea = new TestEx();
			ea.f2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void f() throws FileNotFoundException, IOException {
		FileInputStream in = new FileInputStream("myfile.txt");
		int b;
		b = in.read();
		while(b != -1){
			System.out.print((char)b);
			b = in.read();
		}
	}
	
	/*
	void f2() {
		try {
			f();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	*/
	
	void f2() throws IOException {
		f();
	}
}

