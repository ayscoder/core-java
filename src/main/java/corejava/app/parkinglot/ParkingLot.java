package corejava.app.parkinglot;

class Member extends Thread {
	private ParkingLot parkingLot;
	private String personName;

	Member(String personName, ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
		this.personName = personName;
		super.start();
	}

	public void run() {

		parkingLot.park(personName);

		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//leave parking after 30 seconds
		parkingLot.unPark(personName);
	}
}

public class ParkingLot {

	private int parkingMaxCapacity;
	private int totalParkedCar = 0;

	public ParkingLot(int maxCapacity) {
		this.parkingMaxCapacity = maxCapacity;
	}

	public synchronized void park(String personName) {

		while (totalParkedCar >= parkingMaxCapacity) {
			System.out.println(personName + " has to wait as parking lot is full!!");

			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		totalParkedCar += 1;
		System.out.println(personName + " has parked the car!");

	}

	public synchronized void unPark(String personName) {
		totalParkedCar -= 1;
		System.out.println(personName + " has left, notify a waiting thread!");
		notify();
	}
	
	public static void main(String[] args) {
		ParkingLot parking=new ParkingLot(2);
		
		new Member("Ayush",parking);
		new Member("Peeyush",parking);
		new Member("Sanjay",parking);
		new Member("Mickky",parking);
	}
}
