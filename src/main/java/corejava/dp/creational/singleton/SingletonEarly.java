package corejava.dp.creational.singleton;

import java.io.ObjectStreamException;

public class SingletonEarly implements Cloneable {
	private static SingletonEarly instance = new SingletonEarly();

	private SingletonEarly() {
		// to prevent object creation via Reflection
		if (instance != null) {
			throw new RuntimeException("Only one object is allowed!");
		}
	}

	public static SingletonEarly getInsanace() {
		return instance;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public Object readResolve() throws ObjectStreamException {
		return instance;
	}
}
