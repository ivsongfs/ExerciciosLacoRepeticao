package atividades;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("População A: ");
		double a = scan.nextDouble();

		System.out.print("População B: ");
		double b = scan.nextDouble();

		System.out.print("Taxa PopA: ");
		double taxaA = scan.nextDouble();

		System.out.print("Taxa PopB: ");
		double taxaB = scan.nextDouble();

		boolean taxaValida = false;
		int cont = 0;

		while (!taxaValida) { 

			if (taxaA < taxaB) {
				System.out.println();
				System.out.println("Taxa da PopA precisa ser maior que da PopB. ");
				System.out.print("Digite novamente a Taxa da PoPB:  ");
				taxaB = scan.nextDouble();

			} else {

				taxaValida = true;

			}

		}

		while (a < b) {
			a += (a / 100) * taxaA;
			b += (b / 100) * taxaB;
			cont++;
		}

		scan.close();

		System.out.printf("População A: %.3f%n", a);
		System.out.printf("População B %.3f%n", b);
		System.out.println("Anos: " + cont);

	}
}
