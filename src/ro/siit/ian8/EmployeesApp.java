package ro.siit.ian8;

public class EmployeesApp {
	public static void main(String[] args) {
		PartTimeEmployee partEmployee = new PartTimeEmployee();
		double salary = partEmployee.calculatePay();

		Employee fullEmployee = new Employee("asd");
		double fullEmployeeSalary = fullEmployee.calculatePay();
		System.out.println("The salary for a part time employee is " + salary);
		System.out.println("The salary for a full time employee is " + fullEmployeeSalary);
	}
}
