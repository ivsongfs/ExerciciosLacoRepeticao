package atividades;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double temperatura = 0;
		double media = 0;
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		System.out.print("Quantas temperaturas serão registradas: ");
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Temperatura #" + i + ": ");
			 temperatura = scan.nextDouble();
			 media = media + temperatura;
			 
			 if(temperatura > maior) {
				 maior = temperatura;
				 
			 }else {
				menor = temperatura;
			 }
			 
		}
		
		
		
		System.out.println();
		
		System.out.println("Maior: " + maior );
		
		System.out.println("Menor: " + menor);
		
		System.out.println("Media: " + (media /  n));
		
		
		
		scan.close();

	}

}
