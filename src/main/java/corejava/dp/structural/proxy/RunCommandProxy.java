package corejava.dp.structural.proxy;

/**
 * In the proxy pattern, a proxy class is used to control access to another class
 */
public class RunCommandProxy {
	IRunCommand runCommand;
	boolean isToRun;

	public RunCommandProxy(String user, String pass) {
		runCommand = new RunCommandImpl();
		if(user.equals("admin") && pass.equals("pass")){
			isToRun=true;
		}
	}

	public void runCmdViaProxy(String cmd) {
		if (isToRun) {
			runCommand.run(cmd);
		} else {
			System.out.println("Access denied");
		}
	}
	
	public static void main(String[] args) {
		RunCommandProxy proxy=new RunCommandProxy("admin", "pass");
		proxy.runCmdViaProxy("ls -lrt");
	}

}
