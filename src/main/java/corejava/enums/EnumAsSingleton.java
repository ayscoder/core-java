package corejava.enums;

public enum EnumAsSingleton {
	INSTANCE;
	public void show() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		EnumAsSingleton.INSTANCE.show();
	}
}
