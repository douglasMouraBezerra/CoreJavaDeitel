package deitelCapitulo2;

import java.util.Scanner;

/**
 * Exercicio cap 2 questao 32 Deitel Java Como Programar
 * 
 * @author Douglas
 *
 */
public class Exercicio2_32 {

	public static void main(String[] args) {
		// begin
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		int positivo = 0, negativo = 0, zero = 0, count = 0;

		while (count < numbers.length) {
			System.out.print("Informe um numero:");
			numbers[count] = scanner.nextInt();
			count = count + 1;
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				positivo = positivo + 1;
			} else if (numbers[i] < 0) {
				negativo = negativo + 1;
			} else if (numbers[i] == 0) {
				zero = zero + 1;
			}
		}

		System.out.print("Qtd positivos: " + positivo);
		System.out.print("\nQtd negativos: " + negativo);
		System.out.print("\nQtd zeros: " + zero);

		scanner.close();

	}// fim main
}// fim class
