package atividades;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Exibir primos até: ");
		int n = scan.nextInt();
		
		boolean primo;

		

			for (int i = 1; i <= n; i++) {
				
				primo = true;
				
				for(int j = 2; j < i; j++) {
					
					if(i % j == 0) {
						//System.out.println(j + "Não é primo!");
						primo = false;
						//break;
					}
					
					
				}
				
				if(primo) {
					System.out.println(i);
				}
				
			}

		

	}

}
