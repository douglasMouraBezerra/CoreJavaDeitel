package deitelCapitulo7.examples;

public class SumArray {

	public static void main(String[] args) {

		int[] array = { 50, 65, 98, 56, 41, 25, 36, 65, 369, 58, 68, 258, 64, 17, 85, 12, 31, 1, 2, 3, 45, 6, 9, 8, 7,
				10 };

		int sum = 0;

		System.out.printf("%s%8s%n", "INDEX", "VALUE");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8d%n", i, array[i]);
			sum += array[i];
		}

		System.out.printf("\nSum: %d", sum);

	}

}
