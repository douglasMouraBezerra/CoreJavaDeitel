package deitelCapitulo2;

import java.util.Scanner;

/**
 * Exercicio cap 2 questao 30 Deitel Java Como Programar
 * 
 * @author Douglas
 *
 */
public class Exercicio2_30 {

	public static void main(String[] args) {
		// begin

		int numero;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a number: ");
		numero = s.nextInt();

		char[] digitos = String.valueOf(numero).toCharArray();
		for (char c : digitos) {
			System.out.print(c + " ");
		}

		s.close(); // close

	}// fim main
}// fim class
