package deitelCapitulo2;

import java.util.Scanner;

/**
 * Exercicio cap 2 questao 33 Deitel Java Como Programar
 * 
 * @author Douglas
 *
 */
public class Exercicio2_33 {

	public static void main(String[] args) {
		// begin
		Scanner scanner = new Scanner(System.in);
		double weight, tall, imc;
		String resp;

		System.out.print("Enter your weight: ");
		weight = scanner.nextDouble();

		System.out.print("Enter your tall: ");
		tall = scanner.nextDouble();

		imc = weight / (tall * tall);

		if (imc < 18.5) {
			resp = " UnderWeight ";
		} else if (imc > 25 && imc < 30) {
			resp = "OverWeight";
		} else if (imc >= 18.5 && imc < 25) {
			resp = "Normal";
		} else {
			resp = "Obese";
		}

		System.out.printf("Your imc: %.2f\nSituation: %s\n", imc, resp);

		scanner.close();
	}// fim main
}// fim class
