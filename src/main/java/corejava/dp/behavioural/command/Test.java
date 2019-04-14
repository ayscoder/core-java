package corejava.dp.behavioural.command;

public class Test {

	public Test() {
	}

	public static void main(String[] args) {
		ICommand lunchCommand=new LunchCommand(new Lunch());
		ICommand dinnerCommand=new DinnerCommand(new Dinner());
		
		MealInvokerFacade mealInvoker=new MealInvokerFacade(lunchCommand);
		mealInvoker.invokeMeal();
		
		mealInvoker.setCommand(dinnerCommand);
		mealInvoker.invokeMeal();
	}
}
