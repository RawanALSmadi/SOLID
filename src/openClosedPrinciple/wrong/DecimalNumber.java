package openClosedPrinciple.wrong;

public class DecimalNumber extends Number{
	public DecimalNumber() {
		setBase(Base.DECIMAL);
	}
	 public String decToBinary(int num) 
	    { 
		 	String binaryNumber="";
	        int[] binaryNum = new int[1024]; 
	   	    int i = 0; 
	        while (num > 0)  
	        { 
	            binaryNum[i] = num % 2; 
	            num = num / 2; 
	            i++; 
	        } 
	   
	        for (int j = i - 1; j >= 0; j--) 
	        	binaryNumber+= binaryNum[j];
	        return binaryNumber;
	    } 
}
