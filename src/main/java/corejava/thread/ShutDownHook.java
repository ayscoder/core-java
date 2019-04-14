package corejava.thread;

public class ShutDownHook {

	public ShutDownHook() {
	}

	public static void main(String[] args) {
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			
			@Override
			public void run() {
				//Stop all thread
			}
		}));
	}
}
