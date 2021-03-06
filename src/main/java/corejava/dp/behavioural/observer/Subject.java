package corejava.dp.behavioural.observer;

/**
 * The observer pattern is a behavioral object design pattern. In the observer
 * pattern, an object called the subject maintains a collection of objects
 * called observers. When the subject changes, it notifies the observers.
 * Observers can be added or removed from the collection of observers in the
 * subject. The changes in state of the subject can be passed to the observers
 * so that the observers can change their own state to reflect this change.
 * 
 * The subject has an interface that defines methods for attaching and detaching
 * observers from the subject's collection of observers. This interface also
 * features a notification method. This method should be called when the state
 * of the subject changes. This notifies the observers that the subject's state
 * has changed. The observers have an interface with a method to update the
 * observer. This update method is called for each observer in the subject's
 * notification method. Since this communication occurs via an interface, any
 * concrete observer implementing the observer interface can be updated by the
 * subject. This results in loose coupling between the subject and the observer
 * classes.
 * 
 * Now we'll look at an example of the observer pattern. We'll start by creating
 * an interface for the subject called WeatherSubject. This will declare three
 * methods: addObserver(), removeObserver(), and doNotify().
 * 
 * @author ayush
 *
 */
public interface Subject {
	void addObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();
}
