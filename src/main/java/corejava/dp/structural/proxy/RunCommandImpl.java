package corejava.dp.structural.proxy;

public class RunCommandImpl implements IRunCommand {

	public RunCommandImpl() {
	}

	@Override
	public void run(String cmd) {
		System.out.println(cmd +" is running");
	}

}
