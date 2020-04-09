package solid.liskovsubstitutionTraining.Correct;

public class NaturalFoodProvider implements FoodProvider{

	@Override
	public NaturalFood provideFood() {
		return new NaturalFood();
	}

}
