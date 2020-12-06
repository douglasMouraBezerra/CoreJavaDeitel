package deitelCapitulo2;

import java.util.Scanner;

/**
 * Exercicio cap 2 questao 26 Deitel Java Como Programar
 * 
 * @author Douglas
 *
 */
public class Exercicio2_26 {

	public static void main(String[] args) {
		// begin

		int n1, n2;
		String resposta;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter first number: ");
		n1 = s.nextInt();

		System.out.print("Enter second number: ");
		n2 = s.nextInt();

		if (n1 % n2 == 0) {
			resposta = "e multiplo";
		} else {
			resposta = "nao e multiplo";
		}

		System.out.printf("%d %s %d\n", n1, resposta, n2);

		s.close(); // close

	}// fim main
}// fim class
