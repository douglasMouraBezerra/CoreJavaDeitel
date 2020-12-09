package deitelCapitulo16.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort1 {

	public static void main(String[] args) {
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

		List<String> list = new ArrayList<String>(Arrays.asList(suits));
		System.out.printf("Lista desordenada: %s%n",list);
		
		Collections.sort(list); //ordenando de forma natural, sem compaeTo
		System.out.printf("Lista ordenada: %s%n", list);
		
		
	}
}
