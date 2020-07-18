package atividades;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Turmas: ");
		int t = scan.nextInt();

		int[] turma = new int[t];
		double soma = 0;
		double media = 0;
		boolean valido = false;

		for (int i = 0; i < turma.length; i++) {

			System.out.print("Alunos da turma # " + (1 + i) + ": ");
			turma[i] = scan.nextInt();

			while (!valido) {
				if (turma[i] > 40) {
					System.out.printf("Numeros de alunos não pode ser maior que 40. %n Tente novamente: ");
					turma[i] = scan.nextInt();

				} else {
					valido = true;
				}
			}
			soma += turma[i];
			media = soma / t;

		}

		System.out.printf("Media das turmas: %.2f " , media);

	}

}
