package corejava.skeletal;

public class MathImpl extends AbstractMath{

	public MathImpl() {
	}

	@Override
	public void multiply() {
		System.out.println("Multiply is implemented");
	}

	public static void main(String[] args) {
		IMath math=new MathImpl();
		math.plus();
		math.minus();
		math.multiply();
	}
}
