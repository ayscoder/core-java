package corejava.exception;

/**
 * In finally block, Return statement of Exception will override return and exception in try
 * @author ayush
 *
 */
public class TestFinally {

	public TestFinally() {
	}

	//Return in finally override return in try
	@SuppressWarnings("finally")
	public static int test1() {
		try {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
	
	//Return in finally override exception in try
	@SuppressWarnings("finally")
	public static int test2() {
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			return 2;
		} finally {
			return 4;
		}
	}
	
	//Exception in finally override return in try
	@SuppressWarnings("finally")
	public static int test3() {
		try {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			throw new RuntimeException();
		}
	}
	
	public static void main(String[] args) {
		System.out.println(test1());
		System.out.println(test2());
		System.out.println(test3());

	}
}
