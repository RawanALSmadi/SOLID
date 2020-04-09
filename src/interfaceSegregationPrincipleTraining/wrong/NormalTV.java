package interfaceSegregationPrincipleTraining.wrong;

public class NormalTV extends BasicTV{



	@Override
	public int getNumberOfPointPerTouch() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("This normal TV  does not support to touch screen");
	}

	@Override
	public boolean connectToWifi() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("This normal TV does not support to Wifi");
	}

	@Override
	public Strong unbreakableScreenStrongest() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("This normal TV does not support to unbreakable screen");
	}

}
