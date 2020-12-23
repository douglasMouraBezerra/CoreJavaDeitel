package deitelCapitulo16.exercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Classe que recebe entradas de nomes do usuario e as adiciona em uma estrura
 * Set, removendo as duplicadas. Valores ficam desordenados, em caso de querer a
 * ordem natural do elementos, usar um SortedSet.
 * 
 * @author Douglas
 *
 */
public class EliminaDuplicatas {

	private static Set<String> listNames = new HashSet<String>();

	public static void addNames() {
		try (Scanner entrada = new Scanner(System.in)) {

			while (true) {
				System.out.print("Digite um nome: ");
				String nome = entrada.nextLine();

				if (nome.equals(""))
					break;

				listNames.add(nome);
			}
		}
	}

	public static void showNames() {
		System.out.printf("%nLista de Nomes sem duplicatas:::%n");

		for (String nome : listNames)
			System.out.println(nome);
	}

	public static void main(String[] args) {

		EliminaDuplicatas.addNames();
		EliminaDuplicatas.showNames();

	}
}
