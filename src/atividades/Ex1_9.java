package atividades;

import java.util.Scanner;

public class Ex1_9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Quantas notas serão geradas: ");
		int n = scan.nextInt();

		int[] notas = new int[n];
		
		double soma = 0;
		double media = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota #" + i + ": ");
			notas[i] = scan.nextInt();
			 soma += notas[i];
			 media = soma / n; 
			

		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println();
			System.out.println("Nota " + (i + 1) + " = " + notas[i]);

		}
		
		System.out.println();
		System.out.printf("Media: %.2f", media);

	}

}
