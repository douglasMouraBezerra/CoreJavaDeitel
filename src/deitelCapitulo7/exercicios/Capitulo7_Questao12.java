package deitelCapitulo7.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Capitulo7_Questao12 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int valor, contador = 0;
		int[] frequencia = new int[5];

		while (contador < 5) {
			while (true) {
				System.out.print("Informe um numero: ");
				valor = s.nextInt();

				Arrays.sort(frequencia); //organiza o array para uso do binarySearch()

				if (valor >= 10 && valor <= 100)
					if (Arrays.binarySearch(frequencia, valor) < 0) {
						frequencia[contador] = valor;
						break;
					}
			}

			System.out.print(frequencia[contador] + "\n");

			contador++;
		}

		s.close();

	}

}