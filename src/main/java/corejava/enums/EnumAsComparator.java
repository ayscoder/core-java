package corejava.enums;

import java.util.Comparator;

import corejava.beans.Person;



public enum EnumAsComparator implements Comparator<Person> {
	INSTANCE;

	@Override
	public int compare(Person o1, Person o2) {
		return 0;
	}
}
