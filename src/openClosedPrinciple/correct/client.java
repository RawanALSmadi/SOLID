package openClosedPrinciple.correct;

import java.util.ArrayList;
import java.util.List;

public class client {
	public static void main(String[] args) {
		List<Number> numbers = new ArrayList<Number>();
		Number number1 = new HexNumber();
		Number number2 = new DecimalNumber();
		Number number3 = new OctalNumber();
		
		numbers.add(number1);
		numbers.add(number2);
		numbers.add(number3);

		for (Number num : numbers) {
		System.out.println(num.getBase() +"= "+num.convertToBinary("45"));

		}
	}

}
