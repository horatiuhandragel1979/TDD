package ro.siit.ian8;

public class Truck extends Vehicle {
	private int gearTruck;

	public Truck(int gear, int gearTruck) {
		super(gear);
		this.gearTruck = gearTruck;
	}

	public int getGearTruck() {
		return gearTruck;
	}

	@Override
	public void start() {
		System.out.println("Starting...");
	}

	@Override
	public void stop() {
		System.out.println("Truck stopping...");
	}

	public void stop(String stopMessage) {
		System.out.println(stopMessage);
	}
}
