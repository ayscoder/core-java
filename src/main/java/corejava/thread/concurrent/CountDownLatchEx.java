package corejava.thread.concurrent;

import java.util.concurrent.CountDownLatch;

class Waiter implements Runnable {

	CountDownLatch latch = null;

	public Waiter(CountDownLatch latch) {
		this.latch = latch;
	}

	public void run() {
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Waiter Released");
	}
}

class Decrementer implements Runnable {

	CountDownLatch latch = null;

	public Decrementer(CountDownLatch latch) {
		this.latch = latch;
	}

	public void run() {

		try {
			Thread.sleep(1000);
			this.latch.countDown();

			Thread.sleep(1000);
			this.latch.countDown();

			Thread.sleep(1000);
			this.latch.countDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

/**
 * A java.util.concurrent.CountDownLatch is a concurrency construct that allows
 * one or more threads to wait for a given set of operations to complete.
 * 
 * A CountDownLatch is initialized with a given count. This count is decremented
 * by calls to the countDown() method. Threads waiting for this count to reach
 * zero can call one of the await() methods. Calling await() blocks the thread
 * until the count reaches zero.
 * 
 * Below is a simple example. After the Decrementer has called countDown() 3
 * times on the CountDownLatch, the waiting Waiter is released from the await()
 * call.
 * 
 * @author ayush
 * 
 */
public class CountDownLatchEx {

	public CountDownLatchEx() {
	}

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);

		Waiter waiter = new Waiter(latch);
		Decrementer decrementer = new Decrementer(latch);

		new Thread(waiter).start();
		new Thread(decrementer).start();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
