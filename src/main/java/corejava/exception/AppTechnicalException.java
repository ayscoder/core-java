package corejava.exception;

public abstract class AppTechnicalException extends Exception {
	private static final long serialVersionUID = 1L;

	public AppTechnicalException() {
		super();
	}

	public AppTechnicalException(String errorMessage) {
		super(errorMessage);
	}

	public AppTechnicalException(Throwable cause) {
		super(cause);
	}

	public AppTechnicalException(String errorMessage, Throwable cause) {
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
