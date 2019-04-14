package corejava.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import corejava.beans.Apple;

public class StreamExample {

	public StreamExample() {
	}

	// Java Stream Intermediate Operations:filter, map, sorted, flatmap

	// use filter() method to test stream elements for a condition and generate filtered list.
	public static List<Apple> filterExample(List<Apple> list) {
		Stream<Apple> filter = list.stream().filter((element) -> element.getColor().equals("red"));
		List<Apple> listofRedApple = filter.collect(Collectors.toList());
		return listofRedApple;
	}

	public static List<String> mapExample(List<Apple> list) {
		Stream<String> map = list.stream().map((element) -> element.getColor().toUpperCase());
		List<String> listOfCapitalLetterColorName = map.collect(Collectors.toList());
		return listOfCapitalLetterColorName;
	}
}
