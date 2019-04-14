package corejava.dp.behavioural.template;

/**
 * The template method pattern is a behavioral class pattern. A behavioral class
 * pattern uses inheritance for distribution of behavior. In the template method
 * pattern, a method (the 'template method') defines the steps of an algorithm.
 * The implementation of these steps (ie, methods) can be deferred to
 * subclasses. Thus, a particular algorithm is defined in the template method,
 * but the exact steps of this algorithm can be defined in subclasses. The
 * template method is implemented in an abstract class. The steps (methods) of
 * the algorithm are declared in the abstract class, and the methods whose
 * implementations are to be delegated to subclasses are declared abstract.
 * 
 * Here is an example of the template method pattern. Meal is an abstract class
 * with a template method called doMeal() that defines the steps involved in a
 * meal. We declare the method as final so that it can't be overridden. The
 * algorithm defined by doMeal() consists of four steps: prepareIngredients(),
 * cook(), eat(), and cleanUp(). The eat() method is implemented although
 * subclasses can override the implementation. The prepareIngredients(), cook(),
 * and cleanUp() methods are are declared abstract so that subclasses need to
 * implement them.
 * 
 * @author ayush
 *
 */

abstract class Meal {
	// Template method
	public final void prepareMeal() {
		prepareIngrediant();
		cook();
		eat();
		cleanUp();
	}

	public abstract void prepareIngrediant();

	public abstract void cook();

	public void eat() {
		System.out.println("Nice taste!");
	}

	public abstract void cleanUp();
}

class SouthIndianMeal extends Meal {

	@Override
	public void prepareIngrediant() {
		System.out.println("South Meal - Preparing ingrediant");
	}

	@Override
	public void cook() {
		System.out.println("South Meal - Cooking");
	}

	@Override
	public void cleanUp() {
		System.out.println("South Meal - cleaning up");
	}
}

class NorthIndianMeal extends Meal {

	@Override
	public void prepareIngrediant() {
		System.out.println("North Meal - Preparing ingrediant");
	}

	@Override
	public void cook() {
		System.out.println("North Meal - Cooking");
	}

	@Override
	public void cleanUp() {
		System.out.println("North Meal - cleaning up");
	}
}

public class TestTemplate {

	public TestTemplate() {

	}

	public static void main(String[] args) {
		Meal southMeal = new SouthIndianMeal();
		southMeal.prepareMeal();

		System.out.println();
		Meal northMeal = new NorthIndianMeal();
		northMeal.prepareMeal();
	}
}
