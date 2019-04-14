package corejava.enums;

public class EnumInSwitch {

	public EnumInSwitch() {
	}

	public static void useEnumInSwitch(EnumConstants cons) {
		switch (cons) {
		case TRUE:
			System.out.println("Its true");
			break;

		case FALSE:
			System.out.println("Its false");
			break;
		}

	}

	public static void main(String[] args) {
		useEnumInSwitch(EnumConstants.FALSE);
	}

}
