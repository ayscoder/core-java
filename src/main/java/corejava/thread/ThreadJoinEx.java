package corejava.thread;

class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("HelloWorld in Thread!!");
	}
	
}
public class ThreadJoinEx {

	public ThreadJoinEx() {
	}

	public static void main(String[] args) {
		
		Thread t=new Thread(new Task());
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("End of main thread!!");
	}
}
