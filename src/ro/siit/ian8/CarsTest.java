package ro.siit.ian8;

public class CarsTest {
	public static void main(String[] args) {
//		Car c = new Logan();
//		c.drive();
////		c.driveFancy();
//		Logan l = new Logan();
//		l.driveFancy();
//
//		Vehicle v = new Truck();

		Vehicle v = (Vehicle) new Truck(4,3);
		System.out.println(v.getGear());

		Truck t = (Truck) v;

		System.out.println(t.getGearTruck());
		System.out.println(t.getGear());
	}
}
