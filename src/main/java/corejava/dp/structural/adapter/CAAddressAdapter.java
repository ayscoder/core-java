package corejava.dp.structural.adapter;

public class CAAddressAdapter extends CAAddress implements IAddressValidator {

	public CAAddressAdapter() {
	}

	@Override
	public void validateUSAddress() {
			caAddressValidator();
	}
}
