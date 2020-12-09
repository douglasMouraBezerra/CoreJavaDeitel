package deitelCapitulo16.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		String[] cores = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
		List<String> listaCores = new ArrayList<String>();

		for (String cor : cores)
			listaCores.add(cor);

		String[] removeCores = { "RED", "WHITE", "BLUE" };
		List<String> removeCoresLista = new ArrayList<String>();

		for (String cor : removeCores)
			removeCoresLista.add(cor);

		System.out.println("ArrayList: ");
		for (int i = 0; i < listaCores.size(); i++)
			System.out.printf("%s ", listaCores.get(i));

		removendoCores(listaCores, removeCoresLista);

		System.out.printf("%n%nArrayList apos chamar removendoCores:%n");
		for (String c : listaCores)
			System.out.printf("%s ", c);

	}

	/**
	 * Metodo remove cores especificadas em collection2 a partir de collection1
	 * 
	 * @param collection1
	 * @param collection2
	 */
	private static void removendoCores(Collection<String> collection1, Collection<String> collection2) {
		Iterator<String> iterator = collection1.iterator();

		while (iterator.hasNext())
			if (collection2.contains(iterator.next()))
				iterator.remove(); // remove o elemento atual
	}
}
