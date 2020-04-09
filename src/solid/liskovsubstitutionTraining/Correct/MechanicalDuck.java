package solid.liskovsubstitutionTraining.Correct;

public class MechanicalDuck implements Duck {
	private Type type;
	private Battery battery;

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public String eat(Food food) {
		if (food instanceof ElectricalFood) {
			battery = new Battery();

			return "Eating Food";
		} else
			throw new RuntimeException("Invalid food provider");

	}

	@Override
	public String quack() {

		if (battery.getBatteryCharge() <= 0)
			return "Quack (Electrical Sound)";
		else
			return "";
	}

	public void setType(Type type) {
		this.type = type;
	}

}
