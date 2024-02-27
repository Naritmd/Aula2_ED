package view;

import java.util.Scanner;
import Controller.Ex1_controller;

public class Ex1_view {

	public static void main(String[] args) {
		Ex1_controller ex1_controller = new Ex1_controller();
		Scanner sc = new Scanner(System.in);
		System.out.println ("Insira o valor de A");
		int a = sc.nextInt();
		System.out.println ("Insira o valor de B");
		int b = sc.nextInt();
		
		int soma = 0;
		
		int c = Ex1_controller.i(a,b,soma);
		
		System.out.println("O resultado da multiplicação dos valores é de " + c);

	}

}
