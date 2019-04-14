package corejava.multisorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestChainedComparator {

	public TestChainedComparator() {
	}

	public static void main(String[] args) {
		List<Student> studentlst = new ArrayList<Student>();

		studentlst.add(new Student("Saisesh", 1, 80));
		studentlst.add(new Student("Vinod", 2, 90));
		studentlst.add(new Student("Ajay", 3, 95));

		System.out.println("** Before sorting **:");

		for (Student student : studentlst) {
			System.out.println(student);
		}
		Collections.sort(studentlst, new NameComparator());

		System.out.println("** After sorting **");

		for (Student student : studentlst) {
			System.out.println(student);
		}
	}

}
