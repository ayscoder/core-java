package corejava.dp.structural.decorator;

public class Test {

	public Test() {
	}

	public static void main(String[] args) {
//		new SimpleIceCream().describe();
//		System.out.println("\n");
		new HoneyDecorator(new NutDecorator(new SimpleIceCream())).describe();
	}

}
