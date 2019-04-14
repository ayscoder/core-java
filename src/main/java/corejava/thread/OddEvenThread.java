package corejava.thread;

class Num {
	private boolean isOdd;

	public synchronized void printEven(int n) {
		if (!isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Even=" + n);
		isOdd = false;
		notify();
	}

	public synchronized void printOdd(int n) {
		if (isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Odd=" + n);
		isOdd = true;
		notify();
	}
}

class even extends Thread {
	private Num node;

	even(Num node) {
		this.node = node;
		start();
	}

	public void run() {
		for (int i = 2; i <= 5; i += 2) {
			node.printEven(i);
		}
	}
}

class odd extends Thread {
	private Num node;

	odd(Num node) {
		this.node = node;
		start();
	}

	public void run() {
		for (int i = 1; i <= 5; i += 2) {
			node.printOdd(i);
		}
	}
}

public class OddEvenThread {

	public OddEvenThread() {
	}

	public static void main(String[] args) throws InterruptedException {
		Num node = new Num();
		even even = new even(node);
		odd odd = new odd(node);
		even.join();
		odd.join();
	}

}
