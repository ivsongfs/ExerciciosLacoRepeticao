package atividades;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		//CALCULAR FATORIAL

		Scanner scan = new Scanner(System.in);

		System.out.print("Fatorial de: ");
		int numero = scan.nextInt();
                
                System.out.println("");
                
                
		
		double resultado = numero;
		while (numero > 1) {
			
			numero--;
			System.out.println("Fatorando... " + numero);
			resultado =  resultado * numero;

		}
		
		System.out.println();
		System.out.println("CONSEGUI!!");
		System.out.println("Resultado: " + resultado);
		
		scan.close();

	}

}
