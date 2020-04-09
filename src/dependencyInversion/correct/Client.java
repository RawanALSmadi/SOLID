package dependencyInversion.correct;



public class Client {
	public static void main(String[] args) {
		CompanyProject companyProject = new CompanyProject();

		Developer developer1 = new GWTdeveloper();
		Developer developer2 = new AngularDeveloper();


		companyProject.addDeveloper(developer1);
		companyProject.addDeveloper(developer2);
		
		for(Project project:companyProject.getProjects())
			System.out.println(project);
		
	}
}