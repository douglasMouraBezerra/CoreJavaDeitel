package deitelCapitulo16.examples.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordTypeCount {

	public static void main(String[] args) {
		// cria HashMap para armazenar chaves de Strings e valores Integer
		Map<String, Integer> myMap = new HashMap<>();

		createMap(myMap); // cria mapa com base na entrada do usu�rio
		displayMap(myMap); // exibe o conte�do do mapa
	}

	// cria mapa de entrada de usu�rio
	private static void createMap(Map<String, Integer> map) {
		Scanner scanner = new Scanner(System.in); // cria o scanner
		try {
			System.out.println("Enter a string:"); // solicita a entrada do usu�rio
			String input = scanner.nextLine();

			// tokeniza a entrada
			String[] tokens = input.split(" ");

			// processamento de texto de entrada
			for (String token : tokens) {
				String word = token.toLowerCase(); // obt�m a palavra em letras min�sculas

				// se o mapa contiver a palavra
				if (map.containsKey(word)) // a palavra est� no mapa
				{
					int count = map.get(word); // obt�m a contagem atual
					map.put(word, count + 1); // incrementa a contagem
				} else
					map.put(word, 1); // adiciona nova palavra com uma contagem de 1 para mapa
			}
		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			scanner.close();
		}
	}

	// exibe conte�do do mapa
	private static void displayMap(Map<String, Integer> map) {
		Set<String> keys = map.keySet(); // obt�m chaves

		// classifica as chaves
		TreeSet<String> sortedKeys = new TreeSet<>(keys);

		System.out.printf("%nMap contains:%nKey\t\tValue%n");

		// gera sa�da de cada chave no mapa
		for (String key : sortedKeys)
			System.out.printf("%-10s%10s%n", key, map.get(key));

		System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
	}
}
