package corejava.dp.structural.adapter;

/**
 *  it’s used so that two unrelated interfaces can work together.
 *  The object that joins these unrelated interface is called an Adapter.
 */
public class Client {

	public Client() {
	}

	public void isValidAddress(String type){
		IAddressValidator validator=getValidator(type);
		validator.validateUSAddress();
		
	}

	private IAddressValidator getValidator(String type) {
		if("US".equals(type)){
			return new USAddress();
		}else{
			return new CAAddressAdapter();
		}
	}
	public static void main(String[] args) {
		Client obj=new Client();
		obj.isValidAddress("US1");
		obj.isValidAddress("US");
	}

}
