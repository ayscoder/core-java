package corejava.thread;

public class StopThread implements Runnable {

	private volatile boolean isStop;

	public StopThread() {
	}

	public static void main(String[] args) {
		Thread t1=new Thread(new StopThread());
		t1.start();
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.interrupt();
	}

	@Override
	public void run() {
		while (!isStop) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				isStop=true;
				break;
			}
		}
		if (isStop) {
			System.out.println("Thread Stopped!");
		}
	}
}
