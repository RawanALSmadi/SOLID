package dependencyInversion.correct;

import java.util.ArrayList;
import java.util.List;

public class CompanyProject {
	List<Developer> developers =new ArrayList<Developer>();
	public List<Project> getProjects() {
		List<Project> progects=new ArrayList<Project>();
		for(Developer developer:developers)
			progects.add( developer.develop());
		return progects;
	}
	public List<Developer> getDevelopers() {
		return developers;
	}
	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
	}
	public void addDeveloper(Developer developer) {
		developers.add(developer);
	}
	
	
	
}
