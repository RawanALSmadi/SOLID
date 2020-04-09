package solid.liskovsubstitutionTraining.wrong;

public class Battery {
	private int batteryCharge;

	public Battery() {
		batteryCharge = 100;
	}

	public int getBatteryCharge() {
		return batteryCharge;
	}

	public void setBatteryCharge(int batteryCharge) {
		this.batteryCharge = batteryCharge;
	}

}
