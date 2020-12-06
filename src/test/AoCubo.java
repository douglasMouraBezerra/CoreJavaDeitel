package test;

import java.util.Scanner;

public class AoCubo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe um numero::::");

		int numero = s.nextInt();

		if (numero <= 0 || numero > 1000) {
			System.out.println("invalido");
		} else {

			for (int i = 1; i <= numero; i++) {
				int total = 1;
				int contador = 0;
				int aux = i;

				while (contador < 3) {
					total *= aux;
					
					System.out.print(total + " ");
					contador++;
				}

				System.out.println();
			}

		}

		s.close();
	}
}
