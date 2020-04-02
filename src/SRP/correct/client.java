package SRP.correct;

public class client {
public static void main(String [] arr)
{
	Employee employee = new Employee();
	employee.setFirstName("Ali");
	employee.setLastName("Hmoud");
	employee.setId(1111);
	
	Salary salary =new Salary();
	salary.setSalary(500);
	System.out.println(salary.getAnnualSalary());
	System.out.println(salary.getSocialSecurityAmount());
	System.out.println(salary.increaseSalaryByPercent(0.10));
	System.out.println(salary.addTransportationAllowance(50.0));
}

}
