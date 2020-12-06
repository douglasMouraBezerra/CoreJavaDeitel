package deitelCapitulo2;

import java.util.Scanner;

/**
 * Exercicio cap 2 questao 25 Deitel Java Como Programar
 * 
 * @author Douglas
 *
 */
public class Exercicio2_25 {

	public static void main(String[] args) {
		// begin

		int n1;
		String resposta;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter first number: ");
		n1 = s.nextInt();

		if (n1 % 2 == 0) {
			resposta = "Par";
		} else {
			resposta = "Impar";
		}

		System.out.printf("O numero %d e %s\n", n1, resposta);

		s.close(); // close

	}// fim main
}// fim class
