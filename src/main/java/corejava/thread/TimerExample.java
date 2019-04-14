package corejava.thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Print HelloWorld at every second
 * 
 * @author ayush
 * 
 */
class MyScheduleTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("Hello World");
	}
}

public class TimerExample {

	public TimerExample() {
	}

	public static void main(String[] args) {
		TimerTask task = new MyScheduleTask();
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(task, 5000L, 1000L);//start after 5 second then every 1 second
	}
}
