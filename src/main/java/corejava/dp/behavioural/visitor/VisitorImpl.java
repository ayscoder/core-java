package corejava.dp.behavioural.visitor;

public class VisitorImpl implements IVisitor {

	public VisitorImpl() {
	}

	@Override
	public int visit(Book book) {
		return book.getPrice();
	}

	@Override
	public int visit(Fruit fruit) {
		return fruit.getPrice();
	}

	public static void main(String[] args) {
		IVisitable[] items = new IVisitable[] { new Book("Cathy", 10),
				new Fruit("Apple", 20) };

		IVisitor visitior = new VisitorImpl();

		int sum = 0;
		for (IVisitable v : items) {
			sum += v.accept(visitior);
		}

		System.out.println("Bill=" + sum);
	}
}
