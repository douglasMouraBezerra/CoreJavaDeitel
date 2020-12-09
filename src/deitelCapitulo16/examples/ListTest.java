package deitelCapitulo16.examples;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	private static void printList(List<String> list) {
		System.out.printf("%nList:%n");
		for (String element : list)
			System.out.printf("%s ", element);

		System.out.println();
	}

	private static void convertToUpperCaseStrings(List<String> list) {
		ListIterator<String> listIterator = list.listIterator();

		while (listIterator.hasNext()) {
			String cor = listIterator.next();
			listIterator.set(cor.toUpperCase());
		}
	}

	private static void removeItems(List<String> list, int start, int end) {
		list.subList(start, end).clear();
	}

	private static void printReversedList(List<String> list) {
		ListIterator<String> listIterator = list.listIterator(list.size());
		
		System.out.printf("%nReversed List: %n");

		while (listIterator.hasPrevious())
			System.out.printf("%s ", listIterator.previous());
	}

	public static void main(String[] args) {

		String[] cores = { "preto", "amarelo", "verde", "azul", "violeta", "prata" };

		List<String> list1 = new LinkedList<String>();

		for (String cor : cores)
			list1.add(cor);

		String[] cores2 = { "ouro", "branco", "marrom", "azul", "cinza", "prata" };
		List<String> list2 = new LinkedList<String>();

		for (String cor : cores2)
			list2.add(cor);

		// concatena listas
		list1.addAll(list2);
		list2 = null; // libera recursos
		printList(list1);// exibe lista

		convertToUpperCaseStrings(list1);
		printList(list1);

		System.out.printf("%nDeletando elementos 4 a 6...");
		removeItems(list1, 4, 7); // 4 a 6
		printList(list1);
		printReversedList(list1);

	}
}
