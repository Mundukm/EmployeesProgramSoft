package employeePack;

public class EmployeeFixed extends Employee {

	private double fixedSalary;

	public EmployeeFixed(String name, int id, double fixedSalary) {

		super(name, id);
		this.fixedSalary = fixedSalary;
		averageSalary = fixedSalary;
	}

	//just for modularity
	@Override
	protected double averageCalc() {
		return fixedSalary;
	}

	public double getFixedSalary() {
		return fixedSalary;
	}

	public void setFixedSalary(double fixedSalary) {
		this.fixedSalary = fixedSalary;
		averageSalary = averageCalc();
	}

}
