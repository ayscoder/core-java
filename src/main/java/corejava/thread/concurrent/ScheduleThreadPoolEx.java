package corejava.thread.concurrent;

import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPoolEx {

	public ScheduleThreadPoolEx() {
	}

	public static void main(String[] args) {
		ScheduledExecutorService pool = Executors.newScheduledThreadPool(1);
		
		pool.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				System.out.println(Calendar.getInstance().getTime());
			}
		}, 5L, 1L, TimeUnit.SECONDS);
	}

}
