package corejava.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import corejava.beans.Apple;

public class LambdaExample {

	public LambdaExample() {
	}

	// predicate: (Boolean-valued function) of one argument.
	public static <T> List<T> predicateExample(List<T> list, Predicate<T> p) {
		List<T> newList = new ArrayList<>();
		for (T t : list) {
			if (p.test(t)) {
				newList.add(t);
			}
		}

		return newList;
	}

	// function: accepts one argument and produces a result.
	public static <I, O, T> List<T> functionExample(List<T> list, Function<T, O> f) {
		List<T> newList = new ArrayList<>();
		for (T t : list) {
			O apply = f.apply(t);
			if (apply == Boolean.TRUE) {
				newList.add(t);
			}
		}
		return newList;
	}

	public interface Math {
		int sum(int a, int b);
	}

	public static int add(int a, int b, Math math) {
		return math.sum(a, b);
	}

	public static <T> void printToConsole(List<T> list) {
		list.forEach(t -> System.out.println(t));
	}

	public static void main(String[] args) {
		List<Apple> list = new ArrayList<>();
		list.add(new Apple("red", 100));
		list.add(new Apple("red", 101));
		list.add(new Apple("red", 102));

		list.add(new Apple("green", 100));
		list.add(new Apple("green", 201));

		System.out.println("Original list of Apple:");
		printToConsole(list);

		System.out.println("\nApple with weight 100");
		printToConsole(predicateExample(list, Apple.APPLE_WITH_WEIGHT_100));

		System.out.println("\nApple with red colour:");
		printToConsole(functionExample(list, Apple.APPLE_WITH_COLOUR_RED));

		System.out.println("\nConverted 8 integer value to String: " + Apple.INT_TO_STRING.apply(8));

		System.out.println("\nSum of 1 & 2 => " + add(1, 2, (a, b) -> a + b));
	}
}
