package corejava.dp.creational.factory;

public class AnimalFactory {

	public AnimalFactory() {
	}

	public static IAnimal getAnimal(AnimalType type) {
		switch (type) {
		case DOG:
			return new Dog();
		case CAT:
			return new Cat();
		default:
			break;
		}
		return null;
	}
}
