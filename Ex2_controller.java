package controller;

public class Ex2_controller 
{

	public Ex2_controller() 
	{
		super();
	}

	public static double i (int dividendo, int divisor, double resto)
	{
		if (dividendo < divisor)
		{
			return resto;
		}
		else 
		{
			dividendo = dividendo - divisor;
			resto = dividendo;
		}
		
		return i (dividendo, divisor, resto);
	}
}
