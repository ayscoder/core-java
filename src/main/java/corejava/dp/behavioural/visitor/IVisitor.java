package corejava.dp.behavioural.visitor;

/**
 * When we have to perform an operation on a group of similar kind of Objects.
 * With the help of visitor pattern, we can move the operational logic from the
 * objects to another class.
 */
public interface IVisitor {
	int visit(Book book);

	int visit(Fruit fruit);
}
