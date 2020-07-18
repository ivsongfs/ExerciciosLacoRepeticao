package atividades;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("N1: ");
		int n1 = scan.nextInt();
		System.out.print("N2: ");
		int n2 = scan.nextInt();
		
		int soma = 0;
		
		for(int i = n1; i <= n2; i++) {
			System.out.println(i);
			
			soma += i;
		}
		
		System.out.println(soma);

	}

}
