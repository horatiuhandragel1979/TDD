package ro.siit.ian8;

public class Vehicle {
	private int gear;

	public Vehicle(int gear) {
		this.gear = gear;
	}

	public int getGear() {
		return gear;
	}

	public void start() {

	}
	public void stop() {
		System.out.println("Stopping...");
	}
}
