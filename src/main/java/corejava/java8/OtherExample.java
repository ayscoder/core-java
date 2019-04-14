package corejava.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class OtherExample {

	public OtherExample() {
	}

	// StringJoiner examples
	public static void stringSeparatedBySlash() {
		String dateStr = String.join("/", "10", "Oct", "2017");
		System.out.println("Date String:" + dateStr);
	}

	public static void stringItemSeparatedByCommaAndPrefixAndSuffix() {
		StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
		stringJoiner.add("A");
		stringJoiner.add("B");
		stringJoiner.add("C");
		System.out.println("String items separated by comma and prefix & suffix:" + stringJoiner.toString());
	}

	public static void stringItemSeparatedByComma() {
		StringJoiner stringJoiner = new StringJoiner(",");
		stringJoiner.add("A");
		stringJoiner.add("B");
		stringJoiner.add("C");
		System.out.println("String items separated by comma:" + stringJoiner.toString());
	}

	public static void listOfNameSeparatedByComma() {
		List<String> listOfNames = new ArrayList<>();
		listOfNames.add("Avi");
		listOfNames.add("Bar");

		String listOfNameSeparatedByComma = String.join(",", listOfNames);
		System.out.println("List Of Names Separated By Comma:" + listOfNameSeparatedByComma);
	}

	public static void main(String[] args) {
		stringSeparatedBySlash();
		stringItemSeparatedByComma();
		stringItemSeparatedByCommaAndPrefixAndSuffix();
		listOfNameSeparatedByComma();
	}
}
