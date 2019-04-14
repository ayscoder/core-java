package corejava.dp.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {
	private int value;
	private List<Observer> observers;

	public SubjectImpl() {
		observers = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.doUpdate(value);
		}
	}

	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
}
