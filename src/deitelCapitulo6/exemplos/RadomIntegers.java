package deitelCapitulo6.exemplos;

import java.util.Random;

public class RadomIntegers {

	public static void main(String[] args) {

		Random aleatoryNumbers = new Random();
		int dadoFaces;

		for (int contador = 1; contador <= 20; contador++) {
			dadoFaces = 1 + aleatoryNumbers.nextInt(6); // numeros aleatorios 0 a 6
			System.out.printf("%d  ", dadoFaces);

			if (contador % 5 == 0)
				System.out.println();
		}

	}

}
