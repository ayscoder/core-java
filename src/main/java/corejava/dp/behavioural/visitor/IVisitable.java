package corejava.dp.behavioural.visitor;

/**
 * The visitor pattern is a behavioral object design pattern. The visitor
 * pattern is used to simplify operations on groupings of related objects. These
 * operations are performed by the visitor rather than by placing this code in
 * the classes being visited. Since the operations are performed by the visitor
 * rather than by the classes being visited, the operation code gets centralized
 * in the visitor rather than being spread out across the grouping of objects,
 * thus leading to code maintainability. The visitor pattern also avoids the use
 * of the instanceof operator in order to perform calculations on similar
 * classes.
 * 
 * In the visitor pattern, we have a Visitor interface that declares visit()
 * methods for the various types of elements that can be visited. Concrete
 * Visitors implement the Visitor interface's visit() methods. The visit()
 * methods are the operations that should be performed by the visitor on an
 * element being visited.
 * 
 * The related classes that will be visited implement an Element interface that
 * declares an accept() method that takes a visitor as an argument. Concrete
 * Elements implement the Element interface and implement the accept() method.
 * In the accept() method, the visitor's visit() method is called with 'this',
 * the current object of the Concrete Element type.
 * 
 * The elements to visit all implement the accept() method that takes a visitor
 * as an argument. In this method, they call the visitor's visit() method with
 * 'this'. As a result of this, an element takes a visitor and then the visitor
 * performs its operation on the element.
 * 
 * Let's illustrate the visitor pattern with an example. First, we'll define a
 * NumberVisitor interface. This interface declares three visit methods which
 * take different types as arguments. Note that if we only wrote one visit
 * method, we'd have to use the instanceof operator or a similar technique to
 * handle the different element types. However, since we have separate visit
 * methods, we don't need the instanceof operator, since each visit method
 * handles a different type.
 * 
 * @author ayush
 *
 */
public interface IVisitable {
	int accept(IVisitor visitor);
}
