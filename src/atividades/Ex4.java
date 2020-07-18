package atividades;

import java.util.Locale;

public class Ex4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double a = 80000;
		double b = 200000;
		
		float taxaA = 3.0f;
		float taxaB = 1.5f;
		int cont = 0;
		do {
			a += a * taxaA / 100;
			b += b * taxaB / 100;
			cont++;
		
		}while(a < b);
		
		System.out.println("Anos: " + cont);
		
	}
}
