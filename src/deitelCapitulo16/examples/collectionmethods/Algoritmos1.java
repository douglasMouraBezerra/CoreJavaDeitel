package deitelCapitulo16.examples.collectionmethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algoritmos1 {
	public static void main(String[] args) {
		Character[] letras = { 'P', 'M', 'C' };

		List<Character> list = Arrays.asList(letras);
		System.out.println("A lista contem: ");
		output(list);

		// invertendo ordem
		Collections.reverse(list);
		System.out.printf("%nApos chamar metodo reverse:%n");
		output(list);

		// criando listaCopia
		Character[] copiaLetras = new Character[letras.length];
		List<Character> listaCopia = Arrays.asList(copiaLetras);

		// copiando conteudo de list para listaCopia
		Collections.copy(listaCopia, list);
		System.out.printf("%nApos copiar, a lista copia contem:%n");
		output(listaCopia);

		// preenchendo a lista com R's
		Collections.fill(list, 'R');
		System.out.printf("%nApos chamar o metodo fill, a lista contem:%n");
		output(list);

	}

	private static void output(List<Character> list) {
		System.out.print("A lista e: ");

		for (Character character : list)
			System.out.printf("%s ", character);

		System.out.printf("%nMax: %s", Collections.max(list));
		System.out.printf("  Min: %s%n", Collections.min(list));
	}
}
