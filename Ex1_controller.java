package Controller;

public class Ex1_controller {

	public Ex1_controller() 
	{
		super();
		
	}
	
	public static int i (int a, int b, int soma)
	{
		if (a == 0) 
		{
			return soma;
		}
		else {
			soma = (soma + b);
			return i (a - 1, b, soma);
		}
	}

}
