package deitelCapitulo7.examples;

public class EnhacedForTest {

	public static void main(String[] args) {

		Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 22, 42, 52,
				4, 552, 52, 4527, 57, 2, 725, 725, 7527, 52 };

		int total = 0;

		for (Integer integer : array) {
			total += integer;
		}

		System.out.printf("Soma dos elementos do array: %d \n ",total);

	}

}
