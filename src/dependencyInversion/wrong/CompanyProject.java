package dependencyInversion.wrong;

public class CompanyProject {
	GWTdeveloper developer =new GWTdeveloper();
	public GWTproject getProject() {
		return developer.developGWTproject();
	}
	public GWTdeveloper getDeveloper() {
		return developer;
	}
	public void setDeveloper(GWTdeveloper developer) {
		this.developer = developer;
	}
	
}
