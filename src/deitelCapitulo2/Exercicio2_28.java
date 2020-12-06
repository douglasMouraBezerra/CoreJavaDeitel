package deitelCapitulo2;

import java.util.Scanner;

/**
 * Exercicio cap 2 questao 28 Deitel Java Como Programar
 * 
 * @author Douglas
 *
 */
public class Exercicio2_28 {

	public static void main(String[] args) {
		// begin

		int raio;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter first number: ");
		raio = s.nextInt();

		System.out.printf("Diametro: %d\nCircunferencia: %.2f\nArea: %.2f\n", (2 * raio), (2 * Math.PI * raio),
				(Math.PI * (raio * raio)));

		s.close(); // close

	}// fim main
}// fim class
