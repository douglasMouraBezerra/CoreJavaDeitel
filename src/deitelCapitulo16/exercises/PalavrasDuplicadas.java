package deitelCapitulo16.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * Classe verifica quantidade de palavras repetidas em um frase
 * 
 * @author Douglas
 *
 */
public class PalavrasDuplicadas {

	private static void getFrase(Map<String, Integer> map) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite uma Frase: ");
			String frase = entrada.nextLine();

			String[] tokens = frase.split(" ");

			// se chave ja esta no mapa adiciono mais um ao seu valor
			// se nao estiver adiciono chave ao mapa com valor de 1
			for (String valor : tokens) {
				if (map.containsKey(valor)) {
					int count = map.get(valor);
					map.put(valor, count + 1);

				} else {
					map.put(valor, 1);
				}

			}

		} catch (Exception e) {
			StackTraceElement[] elements = e.getStackTrace();
			for (StackTraceElement stackTraceElement : elements)
				System.out.println(stackTraceElement.toString());
		}
	}

	private static void saida(Map<String, Integer> map) {

		Set<String> set = map.keySet();
		TreeSet<String> treeSet = new TreeSet<>(set);

		for (String chave : treeSet) {
			System.out.println("Chave: " + chave + " Valor: " + map.get(chave));
		}

	}

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		PalavrasDuplicadas.getFrase(map);
		PalavrasDuplicadas.saida(map);

	}

}