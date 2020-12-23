package deitelCapitulo16.exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 * Ordenando palavras de uma frase informada pelo usuario, tokenizando e
 * adicionando a um SortedSet para ordenacao ascendente
 * 
 * @author Douglas
 *
 */
public class OrdemAscendenteTreeset {

	private static String getFrase() {
		String frase = null;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite uma frase: ");
			frase = scanner.nextLine();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return frase;
	}

	private static String[] tokeniza(String string) {
		String[] tokens = string.toLowerCase().split(" ");
		return tokens;
	}

	private static void showFrase(SortedSet<String> set) {
		System.out.println("Frase ordenada::");
		set.forEach(x -> System.out.println(x));
	}

	public static void main(String[] args) {

		String frase = OrdemAscendenteTreeset.getFrase();
		String[] tokens = OrdemAscendenteTreeset.tokeniza(frase);

		// ja ordenados
		SortedSet<String> sortedSet = new TreeSet<String>(Arrays.asList(tokens));

		// imprimindo
		OrdemAscendenteTreeset.showFrase(sortedSet);

	}

}
