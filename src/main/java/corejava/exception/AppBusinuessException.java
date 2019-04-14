package corejava.exception;

public abstract class AppBusinuessException extends Exception {
	private static final long serialVersionUID = 1L;

	public AppBusinuessException() {
		super();
	}

	public AppBusinuessException(String errorMessage) {
		super(errorMessage);
	}

	public AppBusinuessException(Throwable cause) {
		super(cause);
	}

	public AppBusinuessException(String errorMessage, Throwable cause) {
		super(errorMessage, cause);
	}

	public Throwable getOriginalCause(Throwable th) {
		Throwable res = th.getCause();
		Throwable e = th.getCause();
		while ((e = e.getCause()) != null) {
			res = e;
		}
		return res;
	}
}
