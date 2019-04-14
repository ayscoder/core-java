package corejava.dp.behavioural.observer;

public class Observer1 implements Observer {

	public Observer1() {
	}

	@Override
	public void doUpdate(int val) {
		System.out.println("I observer1 updated with value="+val);
	}

}
