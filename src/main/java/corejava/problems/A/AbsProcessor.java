package corejava.problems.A;

public abstract class AbsProcessor implements IDataProcessor<IInputProvider, Ouput> {
	private IInputProvider inputprovider;
	private IOutputProvider outputProvider;

	public AbsProcessor(IInputProvider inputprovider, IOutputProvider outputProvider) {
		super();
		this.inputprovider = inputprovider;
		this.outputProvider = outputProvider;
	}

	public IInputProvider getInputprovider() {
		return inputprovider;
	}

	public void setInputprovider(IInputProvider inputprovider) {
		this.inputprovider = inputprovider;
	}

	public IOutputProvider getOutputProvider() {
		return outputProvider;
	}

	public void setOutputProvider(IOutputProvider outputProvider) {
		this.outputProvider = outputProvider;
	}

	@Override
	public Ouput processData(IInputProvider inputprovider) {
		Input input = getInput(inputprovider);
		Ouput output=process(input);
		putOutput(output);
		return null;
	}

	private void putOutput(Ouput ouput) {
		
	}

	protected abstract Ouput process(Input input);
	
	private Input getInput(IInputProvider inputprovider) {
		return null;
	}
}
