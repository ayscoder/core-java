package corejava.dp.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class CloneExample implements Cloneable, Serializable {

	int num;
	Thing thing;

	public CloneExample clone() {
		try {
			return (CloneExample) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public CloneExample deepClone() {
		CloneExample clone = new CloneExample();
		clone.setNum(this.getNum());
		clone.setThing(this.getThing());
		return clone;
	}

	public CloneExample deepCloneUsingSerialization() {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);

			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			return (CloneExample) ois.readObject();
		} catch (IOException e) {
			return null;
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Thing getThing() {
		return thing;
	}

	public void setThing(Thing thing) {
		this.thing = thing;
	}

	public String toString() {
		return "num:" + num + ", thing:" + thing;
	}

	public static void main(String[] args) {
		CloneExample ce = new CloneExample();
		ce.setNum(3);
		ce.setThing(new Thing("Fred"));
		System.out.println("Before cloning");
		System.out.println("ce:" + ce);

		CloneExample ceShallowClone = ce.clone();
		CloneExample cdDeepClone = ce.deepClone();

		System.out.println("\nAfter cloning, setting ce num to 5");
		ce.setNum(5);
		System.out.println("After cloning, setting ce thing name to Barney");
		Thing thing = ce.getThing();
		thing.setName("Barney");

		System.out.println("ce:" + ce);
		System.out.println("ceShallowClone:" + ceShallowClone);
		System.out.println("cdDeepClone:" + cdDeepClone);

		System.out.println(
				"\nNotice that changing ce thing name to Barney changed ceShallowClone's thing name to Barney.");
		System.out.println(
				"This is because the copy was shallow, and ce's thing and ceShallowClone's thing point to the same Thing.");
		System.out.println(
				"Notice that ceDeepClone's thing name is Fred. This is because the deep copy resulted in ceDeepClone having its own Thing.");
	}

}