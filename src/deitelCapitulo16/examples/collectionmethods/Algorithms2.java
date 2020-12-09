package deitelCapitulo16.examples.collectionmethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms2 {
	public static void main(String[] args) {

		String[] colors = { "red", "white", "yellow", "blue" };

		List<String> list1 = Arrays.asList(colors);
		ArrayList<String> list2 = new ArrayList<String>();

		// add elements to the end of the list2
		list2.add("black");
		list2.add("red");
		list2.add("green");

		System.out.print("Antes de usar o metodo addAll, list2 contem: ");
		for (String cor : list2)
			System.out.printf("%s ", cor);

		// add colors a list2
		Collections.addAll(list2, colors);

		System.out.printf("%nApos addAll, list2 contem: ");
		for (String s : list2)
			System.out.printf("%s ", s);

		// obtém frequencia de "red"
		int frequency = Collections.frequency(list2, "red");
		System.out.printf("%nFrequencia de red na list2 : %d%n", frequency);

		// verifica se list1 e list2 tem elementos em comum
		boolean disjoint = Collections.disjoint(list1, list2);
		// System.out.println(disjoint);
		System.out.printf("list1 e list2 %s elementos em comum%n", disjoint ? "nao tem" : "tem");
	}
}
