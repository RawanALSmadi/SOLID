package openClosedPrinciple.wrong;


public class HexNumber extends Number {
	public HexNumber() {
		setBase(Base.HEX);
	}
public String hexToBinary(String number) {
	
	
	String binaryNumber="";
	for(int i=0;i<number.length();i++)
	{
		
		binaryNumber+=mapping.get(String.valueOf(number.charAt(i)));
		
		
	}
	return binaryNumber;
}

}
