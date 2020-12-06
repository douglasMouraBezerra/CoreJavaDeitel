package deitelCapitulo2;

import java.util.Scanner;

/**
 * Exercicio cap 2 questao 24 Deitel Java Como Programar
 * 
 * @author Douglas
 *
 */
public class Exercicio2_24 {

	public static void main(String[] args) {
		// begin

		int n1, n2, n3, n4, n5;
		int maior, menor;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter first number: ");
		n1 = s.nextInt();

		System.out.print("Enter second number: ");
		n2 = s.nextInt();

		System.out.print("Enter third number: ");
		n3 = s.nextInt();

		System.out.print("Enter fourth number: ");
		n4 = s.nextInt();

		System.out.print("Enter fifth number: ");
		n5 = s.nextInt();

		if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5) {
			menor = n1;

		} else if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5) {
			menor = n2;

		} else if (n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5) {
			menor = n3;

		} else if (n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5) {
			menor = n4;

		} else {
			menor = n5;
		}

		//
		if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
			maior = n1;

		} else if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) {
			maior = n2;

		} else if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
			maior = n3;

		} else if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) {
			maior = n4;

		} else {
			maior = n5;
		}

		System.out.printf("Maior:%d\nMenor:%d\n", maior, menor);

		s.close(); // close

	}// fim main
}// fim class
