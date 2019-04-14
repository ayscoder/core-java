package corejava.dp.structural.adapter;

public class USAddress implements IAddressValidator {

	public USAddress() {
	}

	@Override
	public void validateUSAddress() {
		System.out.println("US address validated");
	}

}
