package SRP.correct;

public class Salary {
	double salary;

	double getAnnualSalary() {
		return salary * 12;
	}

	double getSocialSecurityAmount() {
		return (salary * 0.075);
	}

	double increaseSalaryByPercent(double d) {
		salary = salary + (salary * d);
		return salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double addTransportationAllowance(double amount)
	{
		this.salary+=amount;
		return salary;
	}
	
}
