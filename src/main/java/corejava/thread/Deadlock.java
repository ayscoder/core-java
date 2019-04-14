package corejava.thread;


/**
 * when two or more threads waiting for each other to release lock and get stuck
 * for infinite time situation is called deadlock
 */
public class Deadlock {

	private String o1 = "A";
	private String o2 = "B";

	public Deadlock() {
	}

	private Thread t1 = new Thread(() -> {
		while (true) {
			synchronized (o1) {
				synchronized (o2) {
					System.out.println(o1 + o2);
				}
			}
		}
	});

	private Thread t2 = new Thread(() -> {
		while (true) {
			synchronized (o2) {
				synchronized (o1) {
					System.out.println(o2 + o1);
				}
			}
		}
	});

	
	public Thread getT1() {
		return t1;
	}

	public Thread getT2() {
		return t2;
	}

	public static void main(String[] args) throws InterruptedException {
		Deadlock deadlockObj=new Deadlock();
		deadlockObj.getT1().start();
		deadlockObj.getT2().start();
		deadlockObj.getT1().join();
		deadlockObj.getT2().join();
		System.out.println("End of Main");
	}

}
