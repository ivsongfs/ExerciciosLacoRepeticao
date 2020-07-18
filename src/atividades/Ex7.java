package atividades;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] numeros = new int[5];
		int maiorValor = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Numero #" + i);
			numeros[i] = scan.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] > maiorValor) {
				maiorValor = numeros[i];

			}

		}

		System.out.println("Maior numero: " + maiorValor);
	}

}
