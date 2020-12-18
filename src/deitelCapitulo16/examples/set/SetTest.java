package deitelCapitulo16.examples.set;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		String[] colors = { "red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray",
				"orange" };

		List<String> list = Arrays.asList(colors);
		System.out.printf("List: %s%n", list);

		printNonDuplicates(list);
	}

	/**
	 * Metodo cria um Set para remover as duplicadas
	 * 
	 * @param collection
	 */
	private static void printNonDuplicates(Collection<String> collection) {
		Set<String> set = new HashSet<String>(collection);

		System.out.printf("%nNão duplicadas sao: ");
		for (String color : set)
			System.out.printf("%s ", color);

		System.out.println();
	}
}
