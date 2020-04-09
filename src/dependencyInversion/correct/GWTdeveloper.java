package dependencyInversion.correct;

public class GWTdeveloper implements Developer {


@Override
public Project develop() {
	return new GWTproject();

}
}
