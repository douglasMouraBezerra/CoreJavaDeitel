package deitelCapitulo4;

import java.util.Scanner;

/**
 * 
 * @author Douglas Moura Exercicios - binarios
 *
 */
public class Exercicio4_31 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int binario = 0;
		int potencia = 0;
		int decimal = 0;

		System.out.print("Informe um numero binario:");
		binario = s.nextInt();

		while (binario != 0) {
			int finalBinario = binario % 10;
			decimal += finalBinario * (Math.pow(2, potencia));
			binario /= 10;
			potencia++;
		}

		System.out.printf("Decimal= %d\n", decimal);

		s.close();

	}
}
