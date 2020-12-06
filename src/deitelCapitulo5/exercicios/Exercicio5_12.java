package deitelCapitulo5.exercicios;

/**
 * Calcular o produto de numeros inteiros impares
 * 
 * @author Douglas
 *
 */
public class Exercicio5_12 {

	public static void main(String[] args) {

		int produto = 1;

		for (int i = 1; i <= 15; i++) {
			if (i % 2 != 0) { // se e impar
				produto *= i;
				System.out.println("Produto de : " + i + " = " + produto);
			}

		}

	}
}
