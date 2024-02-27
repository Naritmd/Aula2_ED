package view;
import java.util.Scanner;
import controller.ex4_controller;

public class Ex4_principal {

	public static void main(String[] args) {
		ex4_controller ex4_controller = new ex4_controller();
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while (a<= 0 && (a%2) !=0)
		{
			System.out.println ("Insira o valor de A");
			a = sc.nextInt()
		}
		
		double soma = 1;
		double c = ex4_controller.sub(a, soma);
		
		System.out.println("A divisão dos valores é de "+c)
					

	}

}
