package deitelCapitulo3;

import javax.swing.JOptionPane;

public class CaixaDialogoSimples {
	
	public static void main(String[] args) {
	
		String nome =JOptionPane.showInputDialog("Qual é o seu nome ?");
		
		String message = String.format("Welcome, %s , to Java Programming", nome.trim());
		
		JOptionPane.showMessageDialog(null, message);
		
	}
	
}
