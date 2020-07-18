package atividades;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Base: ");
		double base = scan.nextDouble();

		System.out.print("Expoente: ");
		double expoente = scan.nextDouble();
		double resultado = base;
		
		for(double i = 1; i<expoente; i++) {
			
			resultado *= base;
			
		}

		
		
		System.out.println(resultado);

	}

}
