package corejava.dp.structural.Flyweight;

public class AdderFlyweight implements IFlyweight {

	public AdderFlyweight() {
		System.out.println("Adder flyweight");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doMath(int i, int j) {
		System.out.println("Adding=" + i + j);
	}
}
