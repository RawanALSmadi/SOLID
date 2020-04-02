package SRP.wrong;

public class client {
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(1111);
		employee.setFirstName("Ali");
		employee.setLastName("Hmoud");
		employee.setSalary(500);
		
		System.out.println(employee.getSocialSecurityAmount());
		System.out.println(employee.increaseSalaryByPercent(0.10));
		System.out.println(employee.getAnnualSalary());
		System.out.println(employee.addTransportationAllowance(50.0));



	}
}
