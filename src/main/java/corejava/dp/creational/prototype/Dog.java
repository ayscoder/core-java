package corejava.dp.creational.prototype;

public class Dog implements Prototype {

	String sound;

	public Dog(String sound) {
		this.sound = sound;
	}

	@Override
	public Prototype doClone() {
		return new Dog(sound);
	}

	public String toString() {
		return "This dog says " + sound;
	}

	public static void main(String[] args) {

		Person person1 = new Person("Fred");
		//System.out.println("person 1:" + person1);
		Person person2 = (Person) person1.doClone();
		//System.out.println("person 2:" + person2);
		System.out.println(person1==person2);
		System.out.println(person1.equals(person2));
//		Dog dog1 = new Dog("Wooof!");
//		System.out.println("dog 1:" + dog1);
//		Dog dog2 = (Dog) dog1.doClone();
//		System.out.println("dog 2:" + dog2);

	}

}