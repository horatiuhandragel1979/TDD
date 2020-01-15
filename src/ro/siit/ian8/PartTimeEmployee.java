package ro.siit.ian8;

public class PartTimeEmployee extends Employee {

	public PartTimeEmployee() {
		super("name");
	}

	@Override
	public double calculatePay() {
		System.out.println("calculatePay din PartTimeEmployee");
		return super.calculatePay() - 10;
	}

}
