package openClosedPrinciple.correct;

public class OctalNumber extends Number {
	public OctalNumber() {
		setBase(Base.OCTAL);
	}
	@Override
	public String convertToBinary(String number) {
		String binaryNumber="";
		for(int i=0;i<number.length();i++)
		{
			
			binaryNumber+=mapping.get(String.valueOf(number.charAt(i))).substring(1, 4);
			
			
		}
		return binaryNumber;
	}

}
