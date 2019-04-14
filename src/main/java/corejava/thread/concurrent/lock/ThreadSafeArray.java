package corejava.thread.concurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeArray {

	private final int[] array;
	private final int size;
	private final Lock lock = new ReentrantLock();

	public ThreadSafeArray(int size) {
		array = new int[size];
		this.size = size;
	}

	public void set(int index, int value) {
		lock.lock();
		try {
			array[index] = value;
		} finally {
			lock.unlock();
		}
	}

	public int get(int index) {
		lock.lock();
		try {
			return array[index];
		} finally {
			lock.unlock();
		}
	}

	public int getSize() {
		return size;
	}

}
