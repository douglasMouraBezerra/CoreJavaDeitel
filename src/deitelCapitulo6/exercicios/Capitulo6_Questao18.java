package deitelCapitulo6.exercicios;

import java.util.Scanner;

/**
 * 
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao18 {

	public static void squareOfStariscs(int side) {
		for (int i = 1; i <= side; i++) {
			for (int j = 1; j <= side; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Info valor para quadrado solido: ");
		int side = leia.nextInt();

		Capitulo6_Questao18.squareOfStariscs(side);

		leia.close();

	}

}
