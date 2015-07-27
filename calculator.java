
public class Complex extends Number {

	public int wideness;
	public Complex()
	{
		wideness = 30;
	}
	@Override
	protected int getWideness() {
		
		return wideness;
	}

	@Override
	public Number widen() {
		// TODO Auto-generated method stub
		wideness = wideness +10;
		return this;
	}

	@Override
	public Number negate() {
		// TODO Auto-generated method stub
		wideness = 0 - wideness;
		return this;
	}

	@Override
	public Number reciprocate() {
		wideness = 1/ wideness;
		return this;
	}

}






public class Fraction extends Number {

	public int wideness;
	Fraction()
	{
		wideness = 20;
	}
	@Override
	protected int getWideness() {
		// TODO Auto-generated method stub
		
		return wideness;
	}

	@Override
	public Number widen() {
		// TODO Auto-generated method stub
		wideness = wideness +10;
		return this;
	}

	@Override
	public Number negate() {
		// TODO Auto-generated method stub
		wideness = 0 - wideness;
		return this;
	}

	@Override
	public Number reciprocate() {
		// TODO Auto-generated method stub
		wideness  = 1 / wideness;
		return this;
	}

}




public class Integer extends Number {
	public int wideness;

	
	public Integer()
	{
		wideness = 10;
	}
	protected int getWideness() {
		// TODO Auto-generated method stub

		return wideness;
	}

	@Override
	public Number widen() {
		// TODO Auto-generated method stub
		wideness = wideness +10;
		return this;
	}

	@Override
	public Number negate() {
		// TODO Auto-generated method stub
		wideness = 0 - wideness;
		return this;
	}

	@Override
	public Number reciprocate() {
		// TODO Auto-generated method stub
		wideness = 1 / wideness;
		return this;
	}

}
