package atividades;

import java.util.Scanner;

public class Ex18Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos numeros quer verificar: ");
		int n = scan.nextInt();
		
		int[] vetor = new int[n];
		
		
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.println("Vetor posição #" + i);
			vetor[i] = scan.nextInt();
		}
		
		
		for(int i = 0; i < vetor.length; i++) {
			boolean primo = true;
			for(int j = 2; j < vetor[i]; j++ ) {
				if(vetor[i] % j== 0) {
					System.out.println(vetor[i] + " Não é primo - Divisivel por: " + j);
					primo = false;
					break;
				}
				
			}
			
			if(primo == true) {
				System.out.println(vetor[i] + " é primo");
			}
			
		}
		
		
		
		
}
	
}	
	
	
