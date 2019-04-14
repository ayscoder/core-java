package corejava.skeletal;

public abstract class AbstractMath implements IMath {

	public AbstractMath() {
	}

	@Override
	public void plus() {
		System.out.println("plus is completed");
	}

	@Override
	public void minus() {
		System.out.println("minus is completed");
	}

	@Override
	public abstract void multiply();

}
