package calculator2;

public class ComplexFraction extends Number {
	private Fraction real, imaginary = new Fraction(0);
	public ComplexFraction(Fraction real) {
		this.real = real;
		
	}
	public ComplexFraction(Fraction real, Fraction imaginary) {
		this.real = real;
		this.imaginary = imaginary;
		// YOU FILL IN
	}
	public ComplexFraction(Int real, Fraction imaginary) {
		
		this(new Fraction(real),imaginary);
		// YOU FILL IN
	}
	public ComplexFraction(Fraction real, Int imaginary) {
		this(real, new Fraction(imaginary));
		// YOU FILL IN 
	}
	
	public ComplexFraction(Int real, Int imaginary) {
		this(new Fraction(real), new Fraction(imaginary));
		// YOU FILL IN
	}
	public Fraction getReal() {return real;}  // return real component
	
	public Fraction getImaginary() {return imaginary;} // return imaginary component
	
	// Return a ComplexFraction representing the negation of this
	public Number add(Number n) {
		if (n instanceof ComplexFraction) {
			ComplexFraction temp = (ComplexFraction) n;
			return new ComplexFraction((Fraction)temp.getReal().add(this.getReal()), (Fraction)temp.getImaginary().add(this.getImaginary()) );
			// YOU FILL IN
		}
		return Plus.getInstance().operate(this,n); // will do type conversion for us
	}
	
	// Return a ComplexFraction representing the product of this and n
	/*public Number multiply(Number n) {
		if (n instanceof ComplexFraction) {
			ComplexFraction temp = (ComplexFraction) n;

			return new ComplexFraction((Fraction)(temp.getReal().multiply(this.getReal())  temp.getImaginary().multiply(this.getImaginary())) ), (Fraction)temp.getImaginary().add(this.getImaginary()) );
			// YOU FILL IN
		}
		return Times.getInstance().operate(this,n); // will do type conversion for us
	}*/
	
	/*public Number negate() {
		Fraction temp = this.getReal();
		Fraction temp3 = this.getImaginary();
		Fraction temp2 = new Fraction  ((temp.negate().getDenominator(), temp3.negate().getNumerator() );

		Fraction temp4 = new Fraction(temp3.getDenominator(), temp3.getNumerator());
		return new ComplexFraction(temp2, temp4);
		
		// YOU FILL IN
	}*/

	// Return a ComplextFraction object representing the multipicative inverse of this
	public Number reciprocate() {
		if (Calc.DEBUG) System.out.println("In ComplexFraction.reciprocate: " + this);
		Fraction temp = this.getReal();
		Fraction temp2 = new Fraction  (temp.getDenominator(), temp.getNumerator());
		Fraction temp3 = this.getImaginary();
		Fraction temp4 = new Fraction(temp3.getDenominator(), temp3.getNumerator());
		return new ComplexFraction(temp2, temp4);
		// YOU FILL IN
	}
	
	public int getWideness() { 
		return 30; // Note this is the same as the Decimal wideness
	} 
	
	public Number widen(Number other) {return new ComplexDecimal(this);} // ComplexDecimal is considered wider than ComplexFraction
	
	public String toString() { return real + "," + imaginary;}
	
	public Number compare(Number n) {
		if (n instanceof ComplexFraction) {
			ComplexFraction n1 = (ComplexFraction) n;
			Int c1 = (Int) this.real.compare(n1.real), c2 = (Int) this.imaginary.compare(n1.imaginary);
			if (c1.getIntValue() != 0) return c1;
			return c2;
		}
	
		return Compare.getInstance().operate(this,n);
	}
	@Override
	public Number multiply(Number n) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Number negate() {
		// TODO Auto-generated method stub
		return null;
	}

}




package calculator2;

public class Fraction extends Number {
	private int numerator, denominator; 
	

	public Fraction(Int numerator) {
		this(numerator, Int.ONE);
	}
	public Fraction(Int numerator, Int denominator ) {

		this(numerator.getValue(), denominator.getValue());
		
	}
	
	public Fraction(int numerator) {
		// FILL IN CODE HERE
	}
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator; this.denominator = denominator;
		
		normalize();
	}

	public int getWideness() {
		return 20; // 10, 20, 30, 30, 40 for Integer, Fraction, Decimal, ComplexFraction, ComplexDecimal "wideness" values
	}
	
	public Number widen(Number n) {  // Fraction is the only data type where widening type depends on the type of n
		if (n instanceof ComplexFraction)
			return new ComplexFraction(this);
		else return new Decimal(this);
	}
	
	public Number add(Number n) {
		if (n instanceof Fraction) {
			Fraction temp  = (Fraction) n;
			return new Fraction(temp.getNumerator() / temp.getDenominator() + this.getNumerator() / temp.getDenominator());
			// FILL IN CODE HERE
		}
		return Plus.getInstance().operate(this,n);  // delegate type conversion to Operator classes 
	}
	
	public Number negate() {
		return new Fraction(-this.numerator, this.denominator);
	}
	
	public Number reciprocate() {
		if (Calc.DEBUG) System.out.println("In Fraction.reciprocate: " + this);
		if (this.numerator == 0)
			throw new ArithmeticException("Division by Zero!");
		return new Fraction(this.getDenominator()/ this.getNumerator());
		// FILL IN CODE HERE
	}
	
	public Number multiply(Number n) {
		if (n instanceof Fraction) {
			Fraction temp = (Fraction) n;
			return new Fraction((temp.getNumerator() * this.getNumerator()) / (temp.getDenominator() * this.getDenominator()));
			// FILL IN CODE HERE
		}
		return Times.getInstance().operate(this,n);  // delegate type conversion
	}
	
	public boolean isNegative() {
		return (this.getNumerator() / this.getDenominator()) < 0;
		// FILL IN CODE HERE
	}
	
	public String toString() {
		return "" + this.getNumerator() + "/" + this.getDenominator();
		// FILL IN CODE HERE
	}
	
	private int gcd(int m, int n) {
		if (n == 0)
			return m;
		return gcd(n, m % n);
		// FILL IN CODE HERE
	}
	public int getNumerator()   {return numerator;}
	
	public int getDenominator() {return denominator;}	
	
	private void normalize() {
		if (denominator == 0)
			throw new ArithmeticException("Zero denominator is illegal!!");
		if (denominator < 0) {
			denominator *= -1;
			numerator   *= -1;
		}
		int g = gcd(numerator, denominator);
		numerator /= g; denominator /= g;
	}
	public Number compare(Number n) {
		if (n instanceof Fraction) {
			Fraction diff = (Fraction) this.subtract(n);
			if (diff.numerator == 0) return new Int(0);
			if (diff.isNegative()) return new Int(-1);
			return new Int(1);
		}
	
		return Compare.getInstance().operate(this,n);
	}
}
