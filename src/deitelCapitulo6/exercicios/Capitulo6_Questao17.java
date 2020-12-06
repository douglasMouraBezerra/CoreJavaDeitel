package deitelCapitulo6.exercicios;

import java.util.Scanner;

/**
 * 
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao17 {

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int i = 1;

		while (i <= 10) {

			System.out.print("info number " + i + "\n");
			int n = leia.nextInt();

			System.out.printf("%d e par ?  %b\n", n, Capitulo6_Questao17.isEven(n));

			++i;
		}

		leia.close();

	}

}
