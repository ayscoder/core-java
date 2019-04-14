package corejava.dp.behavioural.observer;

public class Observer2 implements Observer {

	public Observer2() {
	}

	@Override
	public void doUpdate(int val) {
		System.out.println("I observer2 updated with value="+val);
	}

}
