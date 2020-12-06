package deitelCapitulo6.exercicios;

/**
 * Numero perfeito
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao24 {

	public static boolean isPerfect(int number) {
		int total = 0;
		for (int i = 1; i <= number / 2; i++)
			if (number % i == 0)
				total += i;

		return (total == number) ? true : false;

	}

	public static void printFactors(int number) {
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				System.out.print(i + "");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		for (int i = 1; i < 1000000; i++) {
			if (isPerfect(i)) {
				System.out.printf("%d: ", i);
				printFactors(i);
			}
		}

	}

}
