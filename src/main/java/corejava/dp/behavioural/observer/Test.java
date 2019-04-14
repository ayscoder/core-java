package corejava.dp.behavioural.observer;

public class Test {

	public Test() {
	}

	public static void main(String[] args) {
		SubjectImpl s=new SubjectImpl();
		s.setValue(1);
		
		Observer o1=new Observer1();
		Observer o2=new Observer2();
		
		s.addObserver(o1);
		s.addObserver(o2);
		s.notifyObservers();
		
		s.removeObserver(o2);
		s.notifyObservers();
		
	}

}
