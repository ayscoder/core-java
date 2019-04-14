package corejava.dp.behavioural.visitor;

public class Fruit implements IVisitable{

	private String name;
	private int price;

	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	@Override
	public int accept(IVisitor visitor) {
		return visitor.visit(this);
	}
}
