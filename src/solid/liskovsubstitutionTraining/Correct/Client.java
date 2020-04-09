package solid.liskovsubstitutionTraining.Correct;

import java.util.ArrayList;
import java.util.List;


public class Client {

	public static void main(String[] args) {


		List<Duck> ducks = new ArrayList<Duck>();

		ducks.add(new NaturalDuck());
		ducks.add(new MechanicalDuck());
		ducks.add(new NaturalDuck());
		
		
		for (Duck duck : ducks) {
			if(duck instanceof NaturalDuck )
			System.out.println(duck.eat(new NaturalFood()));
			else
				System.out.println(duck.eat(new ElectricalFood()));


		}

	}
}
