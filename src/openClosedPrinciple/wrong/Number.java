package openClosedPrinciple.wrong;

import java.util.HashMap;

public abstract class Number {
public static HashMap<String, String> mapping = new HashMap<String, String>();


private Base base;

public Number () {
	mapping.put("0", "0000");
	mapping.put("1", "0001");
	mapping.put("2", "0010");
	mapping.put("3", "0011");
	mapping.put("4", "0100");
	mapping.put("5", "0101");
	mapping.put("6", "0110");
	mapping.put("7", "0111");
	mapping.put("8", "1000");
	mapping.put("9", "1001");
	mapping.put("A", "1010");
	mapping.put("B", "1011");
	mapping.put("C", "1100");
	mapping.put("D", "1101");
	mapping.put("E", "1110");
	mapping.put("F", "1111");

}
public Base getBase() {
	return base;
}

public void setBase(Base base) {
	this.base = base;
}


}
