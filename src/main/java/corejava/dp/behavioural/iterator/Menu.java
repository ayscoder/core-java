package corejava.dp.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The iterator pattern is a behavioral object design pattern. The iterator
 * pattern allows for the traversal through the elements in a grouping of
 * objects via a standardized interface. An Iterator interface defines the
 * actions that can be performed. These actions include being able to traverse
 * the objects and also obtain the objects.
 * 
 * JavaSW features the widely used java.util.Iterator interface which is used to
 * iterate through things such as Java collections. We can write our own
 * iterator by implementing java.util.Iterator. This interface features the
 * hasNext(), next(), and remove() methods. When writing an iterator for a
 * class, it is very common for the iterator class to be an inner class of the
 * class that we'd like to iterate through.
 * 
 * Let's look at an example of this. We have an Item class, which represents an
 * item on a menu. An item has a name and a price.
 * 
 * @author ayush
 *
 */
class Item {
	private String name;

	public Item(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Menu {
	List<Item> allaCard;

	public Menu() {
		allaCard = new ArrayList<>();
		allaCard.add(new Item("A"));
		allaCard.add(new Item("B"));
		allaCard.add(new Item("C"));

	}

	public Iterator<Item> iterator() {
		return new MenuIterator();
	}

	public class MenuIterator implements Iterator<Item> {
		private int index = 0;

		@Override
		public boolean hasNext() {
			if (index <= allaCard.size() - 1) {
				return true;
			}
			return false;
		}

		@Override
		public Item next() {
			return allaCard.get(index++);
		}

		@Override
		public void remove() {
			allaCard.remove(--index);
		}

	}

	public static void main(String[] args) {

		Menu m = new Menu();
		Iterator<Item> iterator = m.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
	}

}
