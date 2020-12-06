package deitelCapitulo5.exercicios;

import java.util.Scanner;

/**
 * Barras de astericos
 * 
 * @author Douglas
 *
 */
public class Exercicio5_16 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;

		System.out.print("Informe um numero entre 1 e 30:");
		n1 = e.nextInt();

		System.out.print("Informe um numero entre 1 e 30:");
		n2 = e.nextInt();

		System.out.print("Informe um numero entre 1 e 30:");
		n3 = e.nextInt();

		System.out.print("Informe um numero entre 1 e 30:");
		n4 = e.nextInt();

		System.out.print("Informe um numero entre 1 e 30:");
		n5 = e.nextInt();

		boolean eValido1 = (n1 >= 1 && n2 >= 1 && n3 >= 1 && n4 >= 1 && n5 >= 1);
		boolean eValido2 = (n1 <= 30 && n2 <= 30 && n3 <= 30 && n4 <= 30 && n5 <= 30);

		if (eValido1 && eValido2) {

			for (int i = 0; i < n1; i++) {
				System.out.print("*");
			}
			System.out.println();

			for (int i = 0; i < n2; i++) {
				System.out.print("*");
			}
			System.out.println();

			for (int i = 0; i < n3; i++) {
				System.out.print("*");
			}
			System.out.println();

			for (int i = 0; i < n4; i++) {
				System.out.print("*");
			}
			System.out.println();

			for (int i = 0; i < n5; i++) {
				System.out.print("*");
			}
			System.out.println();

		} else {
			System.out.println("Sequencia de numeros invalida\nTente novamente mais tarde...");
		}

		e.close();

	}
}
