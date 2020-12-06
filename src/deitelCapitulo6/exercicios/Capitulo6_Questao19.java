package deitelCapitulo6.exercicios;

import java.util.Scanner;

/**
 * 
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao19 {

	public static void squareOfStariscs(int side, String fillCharacter) {
		for (int i = 1; i <= side; i++) {
			for (int j = 1; j <= side; j++) {
				System.out.print(fillCharacter);
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Info valor para quadrado solido: ");
		int side = leia.nextInt();

		System.out.print("Info caracter para ser exibido:  ");
		String fillCharacter = leia.next();

		if (fillCharacter.length() == 1)
			Capitulo6_Questao19.squareOfStariscs(side, fillCharacter);
		else
			System.out.println("Apenas um caracter por vez !");

		leia.close();

	}

}
