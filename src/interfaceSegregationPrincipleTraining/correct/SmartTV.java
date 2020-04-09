package interfaceSegregationPrincipleTraining.correct;
import interfaceSegregationPrincipleTraining.correct.Strong;

public class SmartTV extends BasicTV implements TouchScreen,UnBreakableScreen,WifiProvider{

	

	@Override
	public int getNumberOfPointPerTouch() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public boolean connectToWifi() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Strong unbreakableScreenStrongest() {
		// TODO Auto-generated method stub
		return Strong.Strong;
	}

}
