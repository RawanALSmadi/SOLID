package solid.liskovsubstitutionTraining.wrong;


public class MechanicalDuck implements Duck {
	private Type type ;
	
	private Battery battery;
	
	@Override
	public Type getType() {
		return type;
	}

	@Override
	public String eat() {
		throw new UnsupportedOperationException(" Mechanical duck  can't eat");

	}

	@Override
	public String quack() {
		if(battery.getBatteryCharge()<=0)
			return "";
		else
			return "Quack (Electrical Sound)";
	}
	
	
	public void changeBattery () {
		battery=new Battery();	
	}
	
	public void setType(Type type) {
		this.type = type;
	}






}
