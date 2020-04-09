package solid.liskovsubstitutionTraining.Correct;

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
	public String eat(Food food) {
		if (food instanceof NaturalFood) 
		return "Eating Food";
		else
			throw new RuntimeException("Invalid food provider");

	}

	@Override
	public String quack() {
		return "Quack";
	}

}
