package deitelCapitulo7.examples;

public class PassArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		System.out.printf(
				"Efeitos de passar uma referencia inteira de um array : %n" + "Os valores do array original são : %n");

		// gera saida de array original
		for (int i : array) {
			System.out.printf("%d ", i);
		}

		modifyArra(array); // modifica array original

		System.out.printf("%nOs valores do array modificado são : %n");
		for (int i : array) {
			System.out.printf("%d ", i);
		}

		System.out.printf("%nEfeitos de passar um elemento de um array antes de modificar o elemento %n"
				+ "array[3] antes de ser modificado : %d%n", array[3]);

		modifyElement(array[3]);

	}

	public static void modifyArra(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] *= 2;
		}

	}

	public static void modifyElement(int elemento) {
		elemento *= 2;
		System.out.printf("%nElemento modificado: %d%n", elemento);
	}

}
