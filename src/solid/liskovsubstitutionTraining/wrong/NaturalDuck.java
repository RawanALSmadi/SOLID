package solid.liskovsubstitutionTraining.wrong;

public class NaturalDuck implements Duck {
	Type type;

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public String eat() {
		return "Eating Food";
	}

	@Override
	public String quack() {
		return "Quack";
	}

}
