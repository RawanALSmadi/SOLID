package dependencyInversion.correct;

public class AngularDeveloper implements Developer {


@Override
public Project develop() {
	return new AngularProject();

}
}
