package deitelCapitulo5.exercicios;

/**
 * Calculando vendas de produtos
 * 
 * @author Douglas
 *
 */
public class Exercicio5_18 {

	public static void main(String[] args) {

		int amount; // amount on deposit at end of each year
		int principal = 1000; // initial amount before interest
		int rate = 5; // interest rate

		System.out.printf("%s%20s\n", "YEAR", "Amount on deposit");

		for (int year = 0; year <= 10; year++) {
			amount = principal * (int) Math.pow(1 + rate, year);

			System.out.printf("%4d%,20d\n", year, amount);

		}

	}
}