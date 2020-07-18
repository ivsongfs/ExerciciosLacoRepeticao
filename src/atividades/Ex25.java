package atividades;

import java.util.Locale;
import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		String opcao;
		boolean continuarCompra = false;
		double total = 0;
		double preco = 0;
		double troco = 0;

		System.out.println("Lojas Tabajara");
		int cont = 1;

		do {

			System.out.print("Informar nova compra? S/N");
			opcao = scan.next();

			if (opcao.equalsIgnoreCase("s")) {
				continuarCompra = true;

				System.out.print("Quantos produtos serão cadastrados: ");
				int qtdProdutos = scan.nextInt();

				total = 0;
				for (int i = 0; i < qtdProdutos; i++) {
					System.out.print("Produto #" + (i + 1) + " R$: ");
					preco = scan.nextDouble();
					total += preco;
				}

				System.out.println("Total: " + total);
				System.out.print("Dinheiro: ");
				double dinheiro = scan.nextDouble();

				troco = dinheiro - total;

				System.out.println("Troco: " + troco);

			} else {
				continuarCompra = false;
			}

		} while (continuarCompra != false);
		
		
		scan.close();
	}

}
