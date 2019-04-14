package corejava.generics;

/*
 *  Generics are very useful and flexible feature of Java. Generics provide safe type casting to
 *  your coding. Along with safe type casting, they also give flexibility to your coding. 
 *  For example, Once you write a class or interface using generics, you can use any type to 
 *  create objects to them. In simple words, You can make objects to work with any type using generics.
 *  
 *  One more addition to generics is Generic Methods. If you don’t want whole class or interface 
 *  to be generic, you want only some part of class as generic, then generic methods will
 *  be solution for this.
 */
public class GenericMethod {

	public GenericMethod() {
	}

	/**
	 * This method can take  any type of object
	 * @param t
	 */
	public <T> void method1(T t) {
		System.out.println(t);
	}

	/**
	 * Bounded type parameter
	 * This method can take Number and its subtype object as input parameter
	 * @param t
	 */
	public <T extends Number> void method2(T t) {
		System.out.println(t);
	}
}
