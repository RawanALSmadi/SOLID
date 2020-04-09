package solid.liskovsubstitutionTraining.Correct;

public class ElectricalFoodProvider implements FoodProvider{

	@Override
	public ElectricalFood provideFood() {
		return new ElectricalFood();
	}

}
