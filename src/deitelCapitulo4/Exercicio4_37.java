package deitelCapitulo4;

import java.util.Scanner;

/**
 * 
 * @author Douglas Moura Exercicios - Fatorial
 *
 */
public class Exercicio4_37 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int number;
		int fat;
		int contador;

		System.out.print("Digite um numero para calculo do fatorial:");
		number = entrada.nextInt();

		if (number >= 0) {
			contador = 1;
			fat = 1;
			while (contador <= number) {
				fat *= contador;
				System.out.printf("fatorial de %d :: %d\n", contador, fat);
				contador++;
			}

		}

		entrada.close();

	}

}
