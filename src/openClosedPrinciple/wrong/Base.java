package openClosedPrinciple.wrong;

public enum Base {
	BINARY(2),OCTAL(8),DECIMAL(10),HEX(16);
int value;

Base(int value) {
	this.value=value;
}

public int getValue() {
	return value;
}


}
