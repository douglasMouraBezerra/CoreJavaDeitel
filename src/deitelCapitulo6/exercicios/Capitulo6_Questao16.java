package deitelCapitulo6.exercicios;

import java.util.Scanner;

/**
 * 
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao16 {

	public static boolean isMultiple(int x, int y) {
		return x % y == 0;
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int i = 1;

		while (i <= 3) {
			System.out.print("Info number one : ");
			int n1 = leia.nextInt();

			System.out.print("Info number two : ");
			int n2 = leia.nextInt();

			boolean isMultiple = Capitulo6_Questao16.isMultiple(n1, n2);

			if (isMultiple)
				System.out.println(n1 + " e multiplo de " + n2);
			else
				System.out.println(n1 + " nao e multiplo de " + n2);

			i++;
		}

		leia.close();

	}

}
