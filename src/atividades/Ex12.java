package atividades;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("Tabuada de: ");
		int opcao = scan.nextInt();
		
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println(opcao + " X " + (i) + " = " + (opcao * i));
			
		}

	}

}
