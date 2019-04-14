package corejava.dp.structural.Flyweight;

public class MultiplierFlyweight implements IFlyweight {

	public MultiplierFlyweight() {
		System.out.println("Multiplier flyweight");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doMath(int i, int j) {
		System.out.println("Multiply=" + i * j);
	}
}
