package atividades;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("F: ");
		int quantidade = scan.nextInt();
	
		
		for(int a= 0, b = 1; a < quantidade; b+=a, a=b-a) {
			
			System.out.print(a + ", ");
			
		}
		
	}

}
