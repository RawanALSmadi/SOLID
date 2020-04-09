package interfaceSegregationPrincipleTraining.wrong;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		List<TV> TVs = new ArrayList<TV>();
		
		SmartTV smartTV = new SmartTV();
		smartTV.setBrand("Sumsung");
		smartTV.setLength(55);
		smartTV.setWidth(23.6);
		TVs.add(smartTV);
		
		NormalTV normalTV = new NormalTV();
		normalTV.setBrand("Sumsung");
		normalTV.setLength(55);
		normalTV.setWidth(23.6);
		TVs.add(normalTV);
		
		for(TV tv :TVs)
		{
			System.out.println(tv.getNumberOfPointPerTouch());
			
		}
		
	}
}
