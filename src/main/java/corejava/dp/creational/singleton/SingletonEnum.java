package corejava.dp.creational.singleton;

public enum SingletonEnum {
	INSTANCE;
	
	public void show() {
		System.out.println("Singleton using enum!");
	}
}
