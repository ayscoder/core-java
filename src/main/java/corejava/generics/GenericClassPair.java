package corejava.generics;

/*The syntax for defining generic class is as follows,

class Class_Name<T1, T2, T3 ... Tn>
{
    //Generic Type or Parameterized type
}
 Where T1, T2, T3 … Tn (T stands for Type) enclosed within angle brackets (<>) are called type
 parameters and class ‘Class_Name‘ is called generic type or parameterized type.
 */
public class GenericClassPair<E1, E2> {

	private E1 first;

	private E2 second;

	public GenericClassPair(E1 first, E2 second) {
		super();
		this.first = first;
		this.second = second;
	}

	public E1 getFirst() {
		return first;
	}

	public void setFirst(E1 first) {
		this.first = first;
	}

	public E2 getSecond() {
		return second;
	}

	public void setSecond(E2 second) {
		this.second = second;
	}

	public static void main(String[] args) {

	}
}
