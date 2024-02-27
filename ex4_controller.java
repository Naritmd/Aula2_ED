package controller;

public class ex4_controller {

	public ex4_controller() {
		super();
	}
	public static double sub (int a, double soma)
	{
		if (a==0)
		{
			return soma;
		}
		else 
		{
			if (a%2 != 0)
			{
				soma = soma * a;
			}
		}
		
		return sub (a- 1, soma);
	}
}
