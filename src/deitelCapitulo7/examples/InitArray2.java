package deitelCapitulo7.examples;

public class InitArray2 {

	public static void main(String[] args) {

		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

		System.out.println("Values in array1 by row are: ");
		outputArray(array1);

		System.out.println("Values in array2 by row are: ");
		outputArray(array2);

	}

	private static void outputArray(int[][] array) {
		for (int linhas = 0; linhas < array.length; linhas++) {
			for (int colunas = 0; colunas < array[linhas].length; colunas++)
				System.out.printf("%d ", array[linhas][colunas]);

			System.out.println();
		}

	}

}
