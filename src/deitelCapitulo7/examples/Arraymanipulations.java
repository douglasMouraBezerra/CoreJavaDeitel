package deitelCapitulo7.examples;

import java.util.Arrays;

public class Arraymanipulations {

	public static void displayArray(int[] array, String description) {
		System.out.printf("%n%s: ", description);

		for (int value : array)
			System.out.printf("%d, ", value);
	}

	public static void main(String[] args) {

		double[] doubleArray = { 89, 65, 79, 2, 5, 1, 6, 4, 9, 7, 56, 100, 1111, 65 };

		// ordenando em ordem crescente
		// uso da API

		Arrays.sort(doubleArray);

		System.out.printf("%ndoubleArray: ");

		for (double value : doubleArray)
			System.out.printf("%.1f ", value);

		// preenche o array de 10 elementos com numeros 7

		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray, 7);
		displayArray(filledIntArray, "filledIntArray");

		// copia um array intArray em intArrayCopy
		int[] intArray = { 1, 2, 3, 4, 5, 6 };
		int[] intArrayCopy = new int[intArray.length];

		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		displayArray(intArray, "intArray");
		displayArray(intArrayCopy, "intArrayCopy");

		// verifica a igualdade de intArray e intArrayCopy
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("%n%nintArray %s intArrayCopy%n", (b ? "==" : "!="));

		// verifica a igualdade de intArray e filledIntArray
		b = Arrays.equals(intArray, filledIntArray);
		System.out.printf("%n%nintArray %s filledIntArray", (b ? "==" : "!="));

		// pesquisa o valor 5 em intArray
		int location = Arrays.binarySearch(intArray, 5);
		if (location >= 0)
			System.out.printf("%nFound 5 at element %d in intArray%n", location);
		else
			System.out.printf("\n%d not found in intArray", location);

	}
}
