package atividades;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Mostrar a tabuada de: ");
		int tabuada = scan.nextInt();
		
		System.out.print("Come�ar por: ");
		int comecar = scan.nextInt();
		
		System.out.print("Terminar por: ");
		int terminar = scan.nextInt();
		
		System.out.println("Vou montar a tabudade de " + tabuada
				+ " come�ando em " + comecar + " e terminando em "
				+ terminar + ":");
		
		for(int i = comecar; i <= terminar; i++) {
			double resultado = tabuada * i;
			System.out.println(tabuada + " X " + i + " = " + resultado);
		}

	}

}
