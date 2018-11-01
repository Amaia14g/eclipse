
public class Fraction {

	//field
	
	private int numerator;
	private int denominator;
	
	//constructor or constructor stack
	
	/**public Fraction(String passFraction1, String passFraction2) {
		int separatorLocation = passFraction1.indexOf("/");
		String strNumerator = passFraction1.substring(0,
				separatorLocation);
		String strDenominator = passFraction1
				.substring(separatorLocation + 1);
	**/
	public Fraction(String fractionString) {
		
		int seperatorLocation = fractionString.indexOf("/");
		String strNumerator = fractionString.substring(0, seperatorLocation);
		String strDenominator = fractionString.substring(seperatorLocation + 1);
		
		this.numerator = Integer.parseInt(strNumerator);
		this.denominator = Integer.parseInt(strDenominator);
	}

	//method
	
	public int getNumerator() {
		return numerator;
	}


	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}


	public int getDenominator() {
		return denominator;
	}


	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
}
