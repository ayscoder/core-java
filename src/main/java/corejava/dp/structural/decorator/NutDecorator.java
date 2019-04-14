package corejava.dp.structural.decorator;

public class NutDecorator extends IceCreamDecorator {

	public NutDecorator(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public void describe() {
		iceCream.describe();
		System.out.println("With nut");
	}
}
