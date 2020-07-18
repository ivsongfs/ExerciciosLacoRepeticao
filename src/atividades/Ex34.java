package atividades;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Valor de N: ");
		int n = scan.nextInt();
		
		double h = 1;
		
		double soma = 0;
		
		System.out.print("S = ");
		for(int i = 1; i <= n; i++) {
			System.out.print( h+"/"+i + " + ");
			
			soma+= h/i ;
		}
		
		System.out.println();
		System.out.println("Soma: " + soma);
		scan.close();

	}

}
