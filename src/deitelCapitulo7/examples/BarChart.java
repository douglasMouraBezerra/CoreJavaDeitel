package deitelCapitulo7.examples;

/**
 * 
 * Programa de impressao de gráfico de barras
 *
 */
public class BarChart {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 95 };
		System.out.println("Grade Distribuition");

		// para cada elemento de array gera saida de uma barra
		for (int counter = 0; counter < array.length; counter++) {
			// gera saida do rotulo
			if (counter == 10)
				System.out.printf("%5d", 100);
			else
				System.out.printf("%02d-%02d:", counter * 10, counter * 10 + 9);

			// imprime barra de asteriscos
			for (int stars = 0; stars < array[counter]; stars++)
				System.out.print("*");

			System.out.println();

		}
	}

}
