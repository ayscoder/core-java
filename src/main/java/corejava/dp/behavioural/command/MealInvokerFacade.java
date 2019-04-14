package corejava.dp.behavioural.command;

public class MealInvokerFacade {

	private ICommand command;

	public MealInvokerFacade(ICommand command) {
		super();
		this.command = command;
	}

	public ICommand getCommand() {
		return command;
	}
	
	

	public void setCommand(ICommand command) {
		this.command = command;
	}

	public void invokeMeal() {
		command.execute();
	}
}
