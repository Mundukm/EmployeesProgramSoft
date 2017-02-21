package employeePack;

import java.io.Serializable;

public abstract class Employee implements Comparable<Employee>, Serializable {

	//for legal serialization
	private static final long serialVersionUID = 1L;
	
	protected String name;
	protected int id;
	protected double averageSalary;

	//the same method to calculate average salary for all child classes
	protected abstract double averageCalc();

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	//getters setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAverageSalary() {
		return averageSalary;
	}

	//comparable interface
	@Override
	public int compareTo(Employee employee) {
		if (this.getAverageSalary() < employee.getAverageSalary()) {
			return 1;
		} else if (this.getAverageSalary() > employee.getAverageSalary()) {
			return -1;
		} else {

			return employee.getName().compareTo(this.getName());
		}

	}

	@Override
	public String toString() {
		return "\nid = " + id + " name = " + name + " salary = " + averageSalary;
	}

}
