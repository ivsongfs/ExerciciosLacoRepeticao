package atividades;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite uma nota: ");
		int nota = scan.nextInt();

		boolean valida = false;

		while (!valida) {
			if (nota > 10) {
				System.out.print("Nota inválida, tente novamente: ");
				nota = scan.nextInt();
			} else {
				System.out.println("Nota válida! " + nota);
				valida = true;
			}

		}

		scan.close();

	}

}
