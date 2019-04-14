package corejava.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Thread Pools are useful when you need to limit the number of threads running
 * in your application at the same time. There is a performance overhead
 * associated with starting a new thread, and each thread is also allocated some
 * memory for its stack etc.
 * 
 * Instead of starting a new thread for every task to execute concurrently, the
 * task can be passed to a thread pool. As soon as the pool has any idle threads
 * the task is assigned to one of them and executed. Internally the tasks are
 * inserted into a Blocking Queue which the threads in the pool are dequeuing
 * from. When a new task is inserted into the queue one of the idle threads will
 * dequeue it successfully and execute it. The rest of the idle threads in the
 * pool will be blocked waiting to dequeue tasks.
 */
public class MyThreadPool {

	private BlockingQueue<Runnable> taskQueue = null;
	private List<Worker> threadList = new ArrayList<Worker>();
	private boolean isStopped = false;

	public MyThreadPool(int noOfThreads, int maxNoOfTasks) {
		taskQueue = new LinkedBlockingQueue<>(maxNoOfTasks);

		for (int i = 0; i < noOfThreads; i++) {
			threadList.add(new Worker(taskQueue));
		}
		
		for (Worker thread : threadList) {
			thread.start();
		}
	}

	public synchronized void execute(Runnable task) throws Exception {
		if (this.isStopped)
			throw new IllegalStateException("ThreadPool is stopped");

		this.taskQueue.add(task);
	}

	public synchronized void stop() {
		for (Worker poolThread : threadList) {
			poolThread.doStop();
		}
	}
}

class Worker extends Thread {

	private BlockingQueue<Runnable> taskQueue = null;
	private boolean isStopped = false;

	public Worker(BlockingQueue<Runnable> queue) {
		taskQueue = queue;
	}

	public void run() {
		while (!isStopped()) {
			try {
				Runnable runnable = (Runnable) taskQueue.take();
				runnable.run();
			} catch (Exception e) {
				// log or otherwise report exception,
				// but keep pool thread alive.
			}
		}
	}

	public synchronized void doStop() {
		isStopped = true;
		this.interrupt(); // break pool thread out of dequeue() call.
	}

	public synchronized boolean isStopped() {
		return isStopped;
	}
}