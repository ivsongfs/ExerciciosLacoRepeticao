package atividades;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double soma = 0;
		double media = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Numero #" + i);
			double numeros = scan.nextDouble();
			soma += numeros;
			media = soma / 5;
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
		
		scan.close();
		
	}

}
