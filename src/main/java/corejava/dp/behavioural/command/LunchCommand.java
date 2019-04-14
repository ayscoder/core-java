package corejava.dp.behavioural.command;

public class LunchCommand implements ICommand {

	private Lunch lunch;

	public LunchCommand(Lunch lunch) {
		super();
		this.lunch = lunch;
	}

	@Override
	public void execute() {
		lunch.makeLunch();
	}
}
