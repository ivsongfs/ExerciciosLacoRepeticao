package atividades;

import java.util.Scanner;

public class Ex17Solucao2 {

	public static void main(String[] args) {
		
		//CALCULAR FATORIAL
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Fatorial de: ");
		int numero = scan.nextInt();
		
		int fatorial = 1;
		
		for(int i = numero; i > 0; i--) {
			fatorial = fatorial * i;
			System.out.println(i);
		}
		
		System.out.println(fatorial);
		
		scan.close();
			
			

	}

}
