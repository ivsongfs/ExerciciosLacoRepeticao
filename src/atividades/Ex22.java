package atividades;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantidade de CD's: ");
		int cd = scan.nextInt();
		
		int investido[] = new int[cd];
		int media = 0;
		for(int i = 0; i < investido.length; i++) {
			System.out.println("Valor pago no CD #" + (i+1));
			investido[i] = scan.nextInt();
			media += investido[i];
		}
		
		System.out.println("Media: " + media);
		

	}

}
