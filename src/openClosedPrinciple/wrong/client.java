package openClosedPrinciple.wrong;

import java.util.ArrayList;
import java.util.List;

public class client {
	public static void main(String[] args) {
		List<Number> numbers = new ArrayList<Number>();
		Number number1 = new HexNumber();
		Number number2 = new DecimalNumber();

		numbers.add(number1);
		numbers.add(number2);
		for (Number num : numbers) {
			if (num instanceof HexNumber)
				System.out.println(num.getBase()+"= "+((HexNumber) num).hexToBinary("96"));

			else if (num instanceof DecimalNumber)
				System.out.println(num.getBase()+"= "+((DecimalNumber) num).decToBinary(9));

		}
	}

}
