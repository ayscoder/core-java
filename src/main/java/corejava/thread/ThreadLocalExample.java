package corejava.thread;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Thread Safe implementation of SimpleDateFormat Each Thread will get its own
 * instance of SimpleDateFormat which will not be shared between other threads.
 */
class PerThreadFormatter {
	private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>() {
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyyMMdd HHmm");
		}
	};

	public static String formatIt(Date date) {
		return formatter.get().format(date);
	}

}

class Job implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<3;i++){
			System.out.println(PerThreadFormatter.formatIt(Calendar.getInstance().getTime()));
		}
	}
}
public class ThreadLocalExample {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(new Job());
		executor.shutdown();
	}
}
