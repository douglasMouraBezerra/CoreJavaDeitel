package deitelCapitulo2;

import java.util.Scanner;

/**
 * Exercicio cap 2 questao 15 Deitel Java Como Programar
 * 
 * @author Douglas
 *
 */
public class Exercicio2_15 {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		double soma = 0;
		double sub = 0;
		double prod = 0;
		double quociente = 0;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter first number: ");
		x = s.nextInt();

		System.out.print("Enter second number: ");
		y = s.nextInt();

		soma = x + y;
		prod = x * y;
		sub = x - y;

		if (y == 0) {
			System.out.println("Não e possivel dividir por zero.");
		} else {
			quociente = x / y;
		}

		System.out.printf("Soma: %.2f\nMultiplicacao:%.2f\nSubtracao:%.2f\nQuociente:%.2f\n", soma, prod, sub,
				quociente);

		// close scanner
		s.close();
	}// fim main
}// fima class
