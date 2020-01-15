package ro.siit.ian8;

public class Employee {
	private final int rate;
	private final String name;

	public Employee(String name) {
		this.name = name;
		this.rate = 3;
	}

	public double calculatePay() {
		System.out.println("calculatePay din Employee");
		return rate * 21;
	}
}
