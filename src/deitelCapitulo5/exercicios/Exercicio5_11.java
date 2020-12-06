package deitelCapitulo5.exercicios;

import java.util.Scanner;

/**
 * Programa que mostra o menor dentre os valores digitados pelo usuario
 * 
 * @author Douglas
 *
 */
public class Exercicio5_11 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n;

		System.out.print("Informe um numero maior que 0 : : :  ");
		n = s.nextInt();

		if (n > 0) {
			int menor = n;

			for (int i = 1; i <= n; i++) {
				System.out.print("Informe um numero:");
				int value = s.nextInt();

				if (value < menor) {
					menor = value;
				}
			}

			System.out.printf("Menor valor digitado e: %d\n", menor);

		} else {
			System.out.println("Numero invalido\nTente mais tade.");
		}

		s.close();
	}
}
