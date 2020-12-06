package deitelCapitulo6.exercicios;

import java.util.Scanner;

/**
 * Separando digitos
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao21 {

	private static int calcCosciente(int dividendo, int divisor) {
		int cosciente = dividendo / divisor;
		return cosciente;

	}

	private static int calcResto(int dividendo, int divisor) {
		int resto = dividendo % divisor;
		return resto;
	}

	public static void displayDigits(int x) {
		int[] numVal = new int[String.valueOf(x).length()];

		// add separated digits to list
		for (int i = numVal.length - 1; i >= 0; i--) {
			numVal[i] = calcCosciente(x, 10);
			x = calcResto(x, 10);
		}

		for (int i = 0; i < numVal.length; i++) {
			System.out.printf("%d  ", numVal[i]);
		}

		System.out.println();
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		displayDigits(leia.nextInt());

		leia.close();

	}

}
