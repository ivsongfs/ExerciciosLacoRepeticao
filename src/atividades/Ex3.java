package atividades;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String nome = null;
		int idade = 0;
		double salario = 0;
		char sexo = 0;
		char estadoCivil = 0;

		boolean nomeValida = false;
		boolean idadeValida = false;
		boolean salarioValido = false;
		boolean sexoValido = false;
		boolean estadoCValido = false;

		while (!nomeValida) {

			System.out.print("Seu nome: ");
			nome = scan.next();

			if (nome.length() > 3) {

				System.out.println("Nome cadastrado!");
				System.out.println();
				nomeValida = true;

			} else {
				System.out.print("Nome pequeno. Tente novamente: ");
				nome = scan.nextLine();
			}

		}

		while (!idadeValida) {

			System.out.print("Sua idade: ");
			idade = scan.nextInt();

			if (idade > 0 && idade <= 150) {
				System.out.println("Idade cadastrada!");
				idadeValida = true;
				System.out.println();
			} else {
				System.out.print("Idade inválida, tenta novamente");
				System.out.println();

			}

		}

		while (!salarioValido) {
			System.out.print("Digite seu salário: ");
			salario = scan.nextDouble();

			if (salario > 0) {
				System.out.println("Salário cadastrado!");
				salarioValido = true;
				System.out.println();
			} else {
				System.out.println("Salário inválido, digite novamente!");
				System.out.println();
			}
		}

		while (!sexoValido) {
			System.out.println("Seu sexo (f) ou (m)");
			sexo = scan.next().charAt(0);

			if (sexo == 'f' || sexo == 'm') {
				System.out.println("Sexo cadastrado com sucesso!");
				sexoValido = true;
				System.out.println();
			} else {
				System.out.println("Sexo inválido, tente novamente!");
				System.out.println();
			}

		}

		while (!estadoCValido) {
			System.out.print("Estado civil (s) (c) (v) (d): ");
			estadoCivil = scan.next().charAt(0);

			if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd') {
				System.out.println("Estado Civil Cadastrado!");
				estadoCValido = true;
				System.out.println();
			} else {
				System.out.println("Estado civil inválido, digite novamente!");
				System.out.println();
			}

		}
		
		scan.close();
		
		System.out.println("----------SEUS DADOS----------");
		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
	}

}
