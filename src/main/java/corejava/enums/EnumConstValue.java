package corejava.enums;

public enum EnumConstValue {
	TRUE(1), FALSE(0);
	private int val;

	private EnumConstValue(int v) {
		this.val = v;
	}

	public void value() {
		System.out.println(val);
	}
}
