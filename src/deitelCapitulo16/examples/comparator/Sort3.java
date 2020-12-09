package deitelCapitulo16.examples.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import deitelCapitulo8.example.Time2;

public class Sort3 {
	public static void main(String[] args) {
		List<Time2> list = new ArrayList<Time2>();

		list.add(new Time2(6, 24, 30));
		list.add(new Time2(7, 30, 21));
		list.add(new Time2(8, 30, 18));
		list.add(new Time2(9, 10, 17));
		list.add(new Time2(9, 10, 16));
		list.add(new Time2(8, 30, 15));
		list.add(new Time2(10, 45, 5));
		list.add(new Time2(12, 50, 10));
		list.add(new Time2(13, 55, 15));

		System.out.printf("Lista desordenada: %n%s%n", list);

		// classificando lista usando o comparator
		Collections.sort(list, new TimeComparator());

		// gerando saida comparada
		System.out.printf("Lista ordenada dos objetos: %n%s%n", list);

	}
}
