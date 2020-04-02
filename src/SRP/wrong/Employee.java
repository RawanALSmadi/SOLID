package SRP.wrong;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private double salary;

	public double getAnnualSalary() {
		return salary * 12;
	}

	public double getSocialSecurityAmount() {
		return (salary * 0.075);
	}

	public double increaseSalaryByPercent(double d) {
		salary = salary + (salary * d);
		return salary;
	}
	public double addTransportationAllowance(double amount)
	{
		this.salary+=amount;
		return salary;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
}
