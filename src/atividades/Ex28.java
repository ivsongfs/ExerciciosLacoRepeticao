package atividades;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Numero: ");
		int numero = scan.nextInt();

		boolean primo = true;

		for (int i = 2; i < numero; i++) {

			if (numero % i == 0) {
				System.out.println("Nao é primo - Divisivel por: " + i);
				primo = false;
				break;
			}

		}
		
		if(primo) {
			System.out.println("É primo!");
		}

		scan.close();

	}

}
