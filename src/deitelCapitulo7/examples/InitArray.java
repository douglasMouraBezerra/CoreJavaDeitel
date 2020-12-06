package deitelCapitulo7.examples;

public class InitArray {

	public static void main(String[] args) {

		int[] c = new int[10];

		System.out.printf("%s%8s%n", "INDEX", "VALUE");

		for (int i = 0; i < c.length; i++)
			System.out.printf("%5d%8d%n", i, c[i]);

		System.out.println();

		int array[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		System.out.printf("%s%8s%n", "INDEX", "VALUE");
		for (int i = 0; i < array.length; i++)
			System.out.printf("%5d%8d%n", i, array[i]);

		System.out.println();

		final int ARRAY_LENGHT = 10;
		int[] array2 = new int[ARRAY_LENGHT];

		System.out.printf("%s%8s%n", "INDEX", "VALUE");
		for (int counter = 0; counter < array2.length; counter++) {
			array2[counter] = 2 + 2 * counter;
			System.out.printf("%5d%8d%n", counter, array2[counter]);
		}
	}

}
