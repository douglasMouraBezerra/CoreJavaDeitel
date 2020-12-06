package deitelCapitulo5.exercicios;

/**
 * Calculo do fatorial de 1 ate 20 .Exibicao de forma tabular
 * 
 * @author Douglas
 *
 */
public class Exercicio5_13 {

	public static void main(String[] args) {

		long fat = 1;

		for (int i = 1; i <= 20; i++) {
			fat = fat * i;
			System.out.println("Fatorial de " + i + " = " + fat);
		}
	}
}
