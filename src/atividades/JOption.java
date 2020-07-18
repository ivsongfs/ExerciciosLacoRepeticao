package atividades;

import javax.swing.JOptionPane;

public class JOption {

	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("Primeira nota");
		String nota2 = JOptionPane.showInputDialog("Segunda nota");
		
		
		
		double media = Integer.parseInt(nota1) + Integer.parseInt(nota2) / 2;
		
		String resultado = JOptionPane.showInputDialog(String.valueOf(media));
	}

}
