package deitelCapitulo2;

import java.util.Scanner;

/**
 * Exercicio cap 2 questao 16 Deitel Java Como Programar
 * 
 * @author Douglas
 *
 */
public class Exercicio2_16 {

	public static void main(String[] args) {
		// begin

		int n1, n2;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter first number: ");
		n1 = s.nextInt();

		System.out.print("Enter second number: ");
		n2 = s.nextInt();

		if (n1 < n2) {
			System.out.println(n2 + " is larger");
		} else if (n1 == n2) {
			System.out.println(" these numbers are equal");
		} else {
			System.out.println(n1 + " is larger");
		}

		s.close(); // close

	}// fim main
}// fim class
