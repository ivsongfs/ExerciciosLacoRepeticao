package atividades;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nome de usuario: ");
		String usuario = scan.next();
		
		System.out.print("Digite sua senha: ");
		String senha = scan.next();
		
		
		
		
		boolean senhaValida = false;
		
		while(!senhaValida) {
			
			if(usuario.equalsIgnoreCase(senha)) {
				System.out.print("Sua senha não pode ser igual ao nome de usuario."
								  + " Tente novamente: ");
				senha = scan.next();
			}else {
				System.out.println("Registro criado com sucesso!");
				System.out.println("Usuario = " + usuario);
				System.out.println("Senha = " + senha);
				senhaValida = true;
			}
			
		}
		
		
		
		
		scan.close();
		
		

	}

}
