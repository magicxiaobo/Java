public class TestThread1 {
	public static void main(String args[]) {
		Run1 r = new Run1();
		r.start();
		//Thread t = new Thread(r);
		//t.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("main --------" + i);
		}
	}
}

class Run1 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}