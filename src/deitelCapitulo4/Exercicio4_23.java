package deitelCapitulo4;

import java.util.Scanner;

/**
 * Programa que recebe a entrada de 10 numeros não repetidos e define o primeiro
 * e o segundo maior numero
 * 
 * @author Douglas
 * 
 */
public class Exercicio4_23 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int primero = 0, segundo = 0, number, count = 1;

		System.out.println("Informe 10 numeros:");
		while (count <= 10) {
			number = s.nextInt();

			if (number > primero) {
				segundo = primero;
				primero = number;
			}

			count++;
		}

		System.out.printf("Primeiro: %d\nSegundo: %d\n", primero, segundo);

		s.close();

	}
}
