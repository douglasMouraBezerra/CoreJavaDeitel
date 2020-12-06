package deitelCapitulo6.exercicios;

import java.util.Scanner;

/**
 * Atribuindo pontuacao para média
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao28 {

	public static void start() {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe sua media: [0 a 100]");
		int average = input.nextInt();

		System.out.println("Seu peso e: " + qualityPoints(average));

		input.close();

	}

	/**
	 * Atribui pesos de 0 a 4 a uma média, dependendo do valor de media.
	 * 
	 * @param average
	 * @return
	 */
	private static int qualityPoints(int average) {
		int peso;

		if (average >= 90 && average <= 100)
			peso = 4;
		else if (average >= 80 && average < 90)
			peso = 3;
		else if (average >= 70 && average < 80)
			peso = 2;
		else if (average >= 60 && average < 70)
			peso = 1;
		else
			peso = 0;

		return peso;

	}

	public static void main(String[] args) {

		start();

	}

}
