package corejava.thread.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class WorkerThread implements Callable<String> {

	private String name;

	public WorkerThread(String name) {
		this.name = name;
	}

	@Override
	public String call()  {
		try {
			Thread.sleep(20000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "complemeted" + name;
	}
}

public class FixedThreadPoolEx {

	public FixedThreadPoolEx() {
	}

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		List<Future<String>> fl = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			fl.add(pool.submit(new WorkerThread("" + i)));
		}

		for (Future<String> f : fl) {
			try {
				System.out.println(f.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		pool.shutdown();
		while (!pool.isTerminated()) {
		}
		System.out.println("All worker thread finished");
	}
}
