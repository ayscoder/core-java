package corejava.dp.structural.decorator;

public abstract class IceCreamDecorator implements IceCream {
	IceCream iceCream;

	public IceCreamDecorator(IceCream iceCream) {
		this.iceCream = iceCream;
	}

}
