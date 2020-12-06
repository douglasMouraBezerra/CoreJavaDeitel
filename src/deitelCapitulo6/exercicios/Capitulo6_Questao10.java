package deitelCapitulo6.exercicios;

import java.util.Scanner;

/**
 * 
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao10 {

	public static void started() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("informe um numero para ser arredondado:::");
		double number = scanner.nextDouble();

		System.out
				.printf("Numero inserido: %f\nRound to tenths: %f\nRound to hundredths: %f\nRound to Thoushandths: %f"
						,number
						,roundToTenths(number)
						,roundToHundredths(number)
						,roundToThousandths(number));

		scanner.close();
	}

	public static double roundToInteger(double x) {
		double y = 0;
		y = Math.floor(x);
		return y;
	}

	public static double roundToTenths(double x) {
		double y = 0;
		y = Math.floor(x * 10 + 0.5f) / 10;
		return y;
	}

	public static double roundToHundredths(double x) {
		double y = 0;
		y = Math.floor(x * 100 + 0.5f) / 100;
		return y;
	}

	public static double roundToThousandths(double x) {
		double y = 0;
		y = Math.floor(x * 1000 + 0.5f) / 1000;
		return y;
	}

	public static void main(String[] args) {
		Capitulo6_Questao10.started();
	}

}
