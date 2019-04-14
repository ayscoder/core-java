package corejava.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Message {
	private String m;

	public String getM() {
		return m;
	}

	public void setM(String m) {
		this.m = m;
	}

	public Message(String m) {
		super();
		this.m = m;
	}

	@Override
	public String toString() {
		return "Message [m=" + m + "]";
	}

}

class Producer1 implements Runnable {

	private BlockingQueue<Message> q;

	public Producer1(BlockingQueue<Message> q) {
		super();
		this.q = q;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				String m = "Message" + i;
				Message message = new Message(m);
				q.put(message);
				System.out.println("Put " + message.toString());
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}

class Consumer1 implements Runnable {

	private BlockingQueue<Message> q;

	public Consumer1(BlockingQueue<Message> q) {
		super();
		this.q = q;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				Message take = q.take();
				System.out.println("Get " + take.toString());
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}

public class BlockingQExample {

	public BlockingQExample() {
	}

	public static void main(String[] args) {
		BlockingQueue<Message> q = new LinkedBlockingQueue<>(10);
		Producer1 p = new Producer1(q);
		Consumer1 c = new Consumer1(q);

		Thread pt = new Thread(p);
		Thread ct = new Thread(c);

		pt.start();
		ct.start();
	}
}
