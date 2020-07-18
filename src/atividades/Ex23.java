package atividades;

import java.util.Locale;

public class Ex23 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double preco = 1.99;

		double soma = 0;
                
                
		for (int i = 1; i <= 50; i++) {
			soma += preco;
			System.out.printf(i + " - R$ %.2f%n", soma);
		}

	}

}
