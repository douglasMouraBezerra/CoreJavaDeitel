package deitelCapitulo16.exercises;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 16.19 Classe que verifica se numero solicitado ao usuario e primo, e caso nao
 * seja e impresso os fatores primos nao repetidos com auxilio de um set
 * 
 * @author Douglas
 *
 */
public class FatoresPrimosComSet {

	private static boolean ehPrimo(int numero) {
		boolean primo = true;

		for (int i = 2; i <= Math.ceil(Math.sqrt(numero)); i++) {
			if (numero % i == 0)
				primo = false;
		}

		if (numero == 1)
			primo = false;

		if (numero == 2)
			primo = true;

		return primo;
	}

	private static Set<Integer> fatoresPrimos(int numero) {
		Set<Integer> set = new TreeSet<Integer>();

		for (int i = 2; i <= numero; i++) {
			while (numero % i == 0) {
				set.add(i);
				numero /= i;
			}
		}
		return set;
	}

	private static void showNumbers(Set<Integer> set) {
		System.out.println("Fatores Primos:::");
		set.forEach(x -> System.out.println(x));
	}

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in);) {

			System.out.println("Informe um numero: ");
			int numero = scanner.nextInt();

			boolean retorno = ehPrimo(numero);

			if (retorno) {
				System.out.println(numero + " e primo.");

			} else { // usando set para excluir repetidos
				Set<Integer> integers = fatoresPrimos(numero);
				showNumbers(integers);
			}
		}
	}
}