package corejava.dp.behavioural.command;

/**
 * The command pattern is a behavioral object design pattern. In the command
 * pattern, a Command interface declares a method for executing a particular
 * action. Concrete Command classes implement the execute() method of the
 * Command interface, and this execute() method invokes the appropriate action
 * method of a Receiver class that the Concrete Command class contains. The
 * Receiver class performs a particular action. A Client class is responsible
 * for creating a Concrete Command and setting the Receiver of the Concrete
 * Command. An Invoker class contains a reference to a Command and has a method
 * to execute the Command.
 * 
 * In the command pattern, the invoker is decoupled from the action performed by
 * the receiver. The invoker has no knowledge of the receiver. The invoker
 * invokes a command, and the command executes the appropriate action of the
 * receiver. Thus, the invoker can invoke commands without knowing the details
 * of the action to be performed. In addition, this decoupling means that
 * changes to the receiver's action don't directly affect the invocation of the
 * action.
 * 
 * The command pattern can be used to perform 'undo' functionality. In this
 * case, the Command interface should include an unexecute() method.
 * 
 * Here is an example of the command pattern. We have a Command interface with
 * an execute() method.
 * 
 * @author ayush
 *
 */
public interface ICommand {
	void execute();
}
