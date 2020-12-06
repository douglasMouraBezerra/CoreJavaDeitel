package deitelCapitulo7.examples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {

	public static void main(String[] args) {

		ArrayList<String> items = new ArrayList<String>();

		items.add("red");
		items.add(0, "yellow");

		System.out.print("Display list contents with counter-controlled loop:");

		for (int i = 0; i < items.size(); i++)
			System.out.printf("%s ,", items.get(i));

		// exibindo com for aprimorado
		display(items, "%nDisplay list contents with enhaced for statement: ");

		items.add("green");
		items.add("yellow");
		display(items, "List with two new elements");

		items.remove("yellow");

		display(items, "Remove first instance of yellow");

		items.remove(1);
		display(items, "Remove second list element (green)");

		// verificando se valor está na lista
		System.out.printf("\"red \" is %s in the list%n", items.contains("red") ? "" : "not");

		// number of elements
		System.out.printf("Size: %s%n", items.size());

	}

	public static void display(List<String> list, String header) {
		System.out.printf(header);

		for (String item : list)
			System.out.printf("%s%n ", item);

	}

}
