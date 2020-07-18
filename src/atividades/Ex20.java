package atividades;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantidade de pessoas: ");
		int n = scan.nextInt();
		
		int[] idade = new int[n];
		int soma = 0;
		int media = 0;
		
		for(int i = 0; i < idade.length; i++) {
			System.out.print("Idade #" + i + ": ");
			idade[i] = scan.nextInt();
			soma += idade[i];
			media = soma / n;
		}
		
		if(media > 0 && media <= 25) {
			System.out.println("A turma é jovem!");
			
		}else if(media >= 26 && media <= 60) {
			System.out.println("A turma é adulta!");
		}else {
			System.out.println("A turma é idosa!");
		}
		
		System.out.println("Media = " + media);
		
	}

}
