package atividades;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("");
		
		boolean naoTerminar = true;
		double totalPagar = 0;
		int quantidade = 0;
		double preco = 0;
		do {
			System.out.print("Digite o código do produto ou 0 para sair: ");
			int cod = scan.nextInt();
			
			if(cod == 0) {
				System.out.printf("Total a pagar: R$%.2f" ,totalPagar);
				
				naoTerminar = false;
			}else {
				System.out.print("Quantidade: ");
				quantidade = scan.nextInt();
				
				
				
				if(cod == 100) {
					preco = 1.20;
					totalPagar += preco * quantidade;
					System.out.printf("Cachorro Qunte | Codigo " + cod + " R$: %.2f" , totalPagar);
				}
				else if(cod == 101) {
					preco = 1.30;
					totalPagar += preco * quantidade;
					System.out.printf("Bauru Simples | Codigo " + cod + " R$: %.2f" , totalPagar);
				}
				else if(cod == 102) {
					preco = 1.50;
					totalPagar += preco * quantidade;
					System.out.printf("Bauru com ovo | Codigo " + cod + " R$: %.2f" , totalPagar);
				}
				else if(cod == 103) {
					preco = 1.20;
					totalPagar += preco * quantidade;
					System.out.printf("Hambúrguer | Codigo " + cod + " R$: %.2f" , totalPagar);
				}
				else if(cod == 104) {
					preco = 1.30;
					totalPagar += preco * quantidade;
					System.out.printf("CheeseBurguer | Codigo " + cod + " R$: %.2f" , totalPagar);
				}
				else if(cod == 105) {
					preco = 1.00;
					totalPagar += preco * quantidade;
					System.out.printf("Refrigerante | Codigo " + cod + " R$: %.2f" , totalPagar);
				}
				
				totalPagar+= preco * quantidade;
				
			}
			
			
			System.out.println();
			
		}while(naoTerminar);
		
		
	}

}
