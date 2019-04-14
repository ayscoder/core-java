package corejava.thread;

/*
 * Thread interference in java is a condition which occurs when more than one threads, 
 * executing simultaneously, access same piece of data. When more than one threads have access to same data, 
 * it is possible that data may get corrupted or one may not get the desired output. 
 * Thread interference occurs when code written is not thread safe.
 * 
 * 
 * 
 * Solution to avoid "Race Condition"
 * 	By declaring the method as synchronized.
 * 	By declaring the variables as final.
 * 	By declaring the variable as volatile.
 * 	By creating the immutable objects.
 * 	By using Atomic operations.
 * 	By restricting the access to same object by multiple threads.
 * 
 * 
 * 
 * */
class Shared {
	int i;

	void SharedMethod() {
		i = 10;
		System.out.println(i);
		i = 20;
		System.out.println(i);
		i = 30;
		System.out.println(i);
	}
}

public class RaceCondition {

	public RaceCondition() {
	}

	public static void main(String[] args) {
		/*
		 * In the above example, There are two threads namely t1 and t2, and
		 * they are using same Shared class object s1. Both t1 and t2 are
		 * calling sharedMethod() of s1 object from their run() method. As we
		 * are starting thread t1 first,
		 * 
		 * let’s assume that thread t1 is executing the last statement of
		 * sharedMethod() (Line 19) and thread t2 has finished executing the
		 * first statement of sharedMethod() (Line 14).
		 * 
		 * While executing last statement, thread t1 will be expecting value of
		 * “i” as 30 as it has assigned 30 to it in the previous statement (Line
		 * 18), but t2 has changed value of “i” to 10 while executing the first
		 * statement.
		 * 
		 * So, t1 will read value of “i” as 10 not 30 as it is expecting.
		 * 
		 */
		final Shared s1 = new Shared();

		Thread t1 = new Thread() {
			@Override
			public void run() {
				s1.SharedMethod();
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				s1.SharedMethod();
			}
		};

		t1.start();
		t2.start();
	}
}
