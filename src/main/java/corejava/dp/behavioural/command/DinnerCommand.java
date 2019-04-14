package corejava.dp.behavioural.command;

public class DinnerCommand implements ICommand {

	private Dinner dinner;

	public DinnerCommand(Dinner dinner) {
		super();
		this.dinner = dinner;
	}

	@Override
	public void execute() {
		dinner.makeDinner();
	}
}
