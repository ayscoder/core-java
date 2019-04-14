package corejava.dp.creational.singleton;

import java.io.ObjectStreamException;

public class SingletonLazy implements Cloneable {
	private static SingletonLazy instance;

	private SingletonLazy() {
		// to prevent object creation via Reflection
		if (instance != null) {
			throw new RuntimeException("Only one object is allowed!");
		}
	}

	public static synchronized SingletonLazy getInsanace() {
		if (instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}

	public SingletonLazy clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public SingletonLazy readResolve() throws ObjectStreamException {
		return instance;
	}
}
