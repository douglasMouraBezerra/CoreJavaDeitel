package test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestIterator {
	public static void main(String[] args) {
		List<String> frutas = new ArrayList<String>();
		frutas.add("BANANA");
		frutas.add("MACA");
		frutas.add("PERA");
		frutas.add("UVA");
		frutas.add("MARACUJA");

		System.out.println(frutas.toString());

		ListIterator<String> iterator = frutas.listIterator();

		// causando erro java.util.ConcurrentModificationException
		// frutas.add("MANGA");

		while (iterator.hasNext()) {
			String f = iterator.next();
			iterator.set(f.toLowerCase());
		}
		System.out.println(frutas.toString());
	}
}
