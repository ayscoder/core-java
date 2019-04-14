package corejava.dp.creational.factory;

public class Test {

	public Test() {
	}

	public static void main(String[] args) {
		IAnimal dog = AnimalFactory.getAnimal(AnimalType.DOG);
		dog.describe();
		
		IAnimal cat = AnimalFactory.getAnimal(AnimalType.CAT);
		cat.describe();
	}

}
