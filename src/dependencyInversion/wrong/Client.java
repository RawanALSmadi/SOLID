package dependencyInversion.wrong;



public class Client {
	public static void main(String[] args) {
		CompanyProject companyProject = new CompanyProject();

		GWTdeveloper developer = new GWTdeveloper();
		companyProject.setDeveloper(developer);

		System.out.println(companyProject.getProject());
		
	}
}