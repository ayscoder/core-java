package corejava.dp.creational.singleton;

import java.io.ObjectStreamException;

/**
 * A singleton is a class that is instantiated only once. This is typically
 * accomplished by creating a static field in the class representing the class.
 * A static method exists on the class to obtain the instance of the class and
 * is typically named something such as getInstance(). The creation of the
 * object referenced by the static field can be done either when the class is
 * initialized or the first time that getInstance() is called. The singleton
 * class typically has a private constructor to prevent the singleton class from
 * being instantiated via a constructor. Rather, the instance of the singleton
 * is obtained via the static getInstance() method.
 * 
 * The SingletonExample class is an example of a typical singleton class. It
 * contains a private static SingletonExample field. It has a private
 * constructor so that the class can't be instantiated by outside classes. It
 * has a public static getInstance() method that returns the one and only
 * SingletonExample instance. If this instance doesn't already exist, the
 * getInstance() method creates it. The SingletonExample class has a public
 * sayHello() method that can be used to test the singleton.
 * 
 * @author ayush
 *
 */
public class SingletonDoubleCheck implements Cloneable {
	private static volatile SingletonDoubleCheck instance;

	private SingletonDoubleCheck() {
		// to prevent object creation via Reflection
		if (instance != null) {
			throw new RuntimeException("Only one object is allowed!");
		}
	}

	public static SingletonDoubleCheck getInsanace() {
		if (instance == null) {
			synchronized (SingletonDoubleCheck.class) {
				if (instance == null) {
					instance = new SingletonDoubleCheck();
				}
			}

		}
		return instance;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public Object readResolve() throws ObjectStreamException {
		return instance;
	}
}
