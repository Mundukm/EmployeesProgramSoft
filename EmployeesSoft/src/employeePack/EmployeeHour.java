package employeePack;

public class EmployeeHour extends Employee {

	//individual for every employee
	private double hourlyRate;

	//constructor with reference to super constructor
	public EmployeeHour(String name, int id, double hourlyRate) {
		super(name, id);
		this.hourlyRate = hourlyRate;
		averageSalary = averageCalc();
	}

	//overridden method from Employee class
	@Override
	protected double averageCalc() {
		return this.hourlyRate * 2.8 * 8;
	}

	//getters and setters
	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
		this.averageSalary = averageCalc();
	}

}
