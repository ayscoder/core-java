package corejava.beans;

import java.util.function.Function;
import java.util.function.Predicate;

public class Apple {
	private String color;
	private int weight;
	public static Function<Integer, String> INT_TO_STRING = (i) -> Integer.toString(i);
	public static Predicate<Apple> APPLE_WITH_WEIGHT_100 = (a) -> a.getWeight() == 100;
	public static Function<Apple, Boolean> APPLE_WITH_COLOUR_RED = (a) -> a.getColor().equals("red");

	public Apple(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
	}

}