package deitelCapitulo6.exemplos;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random random = new Random();

		int face = 0;

		for (int i = 0; i <= 9; i++) {

			face = 2 + random.nextInt(8);

			System.out.print(face + " ");

		}
	}
}
