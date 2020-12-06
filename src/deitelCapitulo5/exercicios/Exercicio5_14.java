package deitelCapitulo5.exercicios;

import java.util.Scanner;

/**
 * Calculo de juros em diferentes taxas
 * 
 * @author Douglas
 *
 */
public class Exercicio5_14 {

	public static void calcJurosPerYear(double taxaDejuros) {
		double principal = 1000.0, calculoPorAno = 0.0;

		for (int ano = 1; ano <= 10; ano++) {
			calculoPorAno = principal * (Math.pow(1.0 + taxaDejuros, ano)); // valores substituidos
			System.out.printf("Ano: %d || Valor: %,20.2f\n", ano, calculoPorAno);
		}
	}

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		String resposta = "sim";

		while (resposta.equalsIgnoreCase("sim")) {
			System.out.println("Informe uma taxa de juros para calculo do salario: ");

			double taxaDeJuros = e.nextDouble();

			Exercicio5_14.calcJurosPerYear(taxaDeJuros);

			System.out.print("\nDeseja Continuar ? SIM / NAO");
			resposta = e.next();
		}

		System.out.println("Fim do Programa");

		e.close();

	}
}
