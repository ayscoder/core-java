package corejava.dp.structural.decorator;

public class HoneyDecorator extends IceCreamDecorator {

	public HoneyDecorator(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public void describe() {
		iceCream.describe();
		System.out.println("With honey");
	}
}
