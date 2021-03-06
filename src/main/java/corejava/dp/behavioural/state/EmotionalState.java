package corejava.dp.behavioural.state;

/**
 * The state pattern is a behavioral object design pattern. The idea behind the
 * state pattern is for an object to change its behavior depending on its state.
 * In the state pattern, we have a Context class, and this class has a State
 * reference to a Concrete State instance. The State interface declares
 * particular methods that represent the behaviors of a particular state.
 * Concrete States implement these behaviors. By changing a Context's Concrete
 * State, we change its behavior. In essence, in the state pattern, a class (the
 * Context) is supposed to behave like different classes depending on its state.
 * The state pattern avoids the use of switch and if statements to change
 * behavior.
 * 
 * Let's look at an example of the state pattern. First off, we'll define the
 * EmotionalState interface. It declares two methods, sayHello() and
 * sayGoodbye().
 * 
 * @author ayush
 *
 */
public interface EmotionalState {
	String sayHello();

	String sayGoodbye();
}
