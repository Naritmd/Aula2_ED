package view;
import java.util.Scanner;
import controller.Ex2_controller;

public class Ex2_view {

	public static void main(String[] args) 
	{
		Ex2_controller Ex2_controller = new Ex2_controller();
		Scanner sc = new Scanner(System.in);
		System.out.println ("Insira o valor do dividendo");
		int dividendo = sc.nextInt();
		System.out.println ("Insira o valor do divisor");
		int divisor = sc.nextInt();
		
		double resto = 0;
		
		double c = Ex2_controller.i(dividendo, divisor, resto);
		
		System.out.println("O resto da equação é de " + c);
			

	}

}
