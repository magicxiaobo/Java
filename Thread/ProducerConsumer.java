public class ProducerConsumer {
	public static void main(String[] args) {
		SyncStack ss = new SyncStack();
		Producer p = new Producer(ss);
		Consumer c = new Consumer(ss);
		
		new Thread(p).start();
		new Thread(c).start();
	}
}

class Mantou {
	int id;
	public void Mantou(int id) {
		this.id = id;
	}
	public String toString() {
		return "ManTou : " + this.id;
	}
}

class SyncStack {
	int index = 0;
	Mantou[] arrMT = new Mantou[6];

	public synchronized void push(Mantou m) {
		while (index == arrMT.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notifyAll();
		arrMT[index++] = m;
	}

	public synchronized Mantou pop() {
		while (index == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notifyAll();
		return arrMT[--index];
	}

}

class Producer implements Runnable {
	SyncStack ss = null;
	Producer (SyncStack ss) {
		this.ss = ss;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			Mantou mt = new Mantou();
			ss.push(mt);
			System.out.println("Produced: " + mt);
			try {
				Thread.sleep((int)(Math.random() * 200));
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}	
		}
	}
}

class Consumer implements Runnable {
	SyncStack ss = null;
	Consumer(SyncStack ss) {
		this.ss = ss;
	}

	public void run() {
		for(int i = 0; i < 60; i++) {
			Mantou mt = ss.pop();
			System.out.println("Consumed: " + mt);
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
		}
	}
}