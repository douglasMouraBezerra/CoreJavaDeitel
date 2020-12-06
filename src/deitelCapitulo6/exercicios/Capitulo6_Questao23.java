package deitelCapitulo6.exercicios;

import java.util.Scanner;

/**
 * Retornar o menor de tres numeros
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao23 {

	public static double minimum(double a, double b, double c) {
		return Math.min(a, Math.min(b, c));
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o primeiro numero:");
		double a = entrada.nextDouble();

		System.out.print("Informe o segundo numero:");
		double b = entrada.nextDouble();

		System.out.print("Informe o terceiro numero:");
		double c = entrada.nextDouble();

		System.out.println("O menor numero digitado e: " + minimum(a, b, c));

		entrada.close();
	}

}
