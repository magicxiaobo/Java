import java.util.*;
public class TestInterrupt {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		try {
			Thread.sleep(10000);		//sleep the main thread
		} catch (InterruptedException e) {
			thread.interrupt();
		}
	}
}

class MyThread extends Thread {
	public void run() {
		while (true) {
			System.out.println("===" + new Date() + "===");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}