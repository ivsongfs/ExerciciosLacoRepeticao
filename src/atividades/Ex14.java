package atividades;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		int contP = 0;
		int contI = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Numero " + i + ": ");
			int numero = scan.nextInt();
			soma += numero;
			
			if(numero % 2 == 0) {
				contP++;
			}else {
				contI++;
			}
			
		}
		System.out.println("Numeros pares: " + contP);
		System.out.println("Numeros impares: " + contI);
		System.out.println("Soma: " + soma);
	}

}
