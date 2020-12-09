package deitelCapitulo16.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort2 {

	public static void main(String[] args) {

		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

		List<String> list = Arrays.asList(suits);
		System.out.printf("Lista desorganizada: %s%n", list);

		// classificando em ordem decrescente usando comparator
		Collections.sort(list, Collections.reverseOrder());
		System.out.printf("Lista organizada: %s%n", list);
	}
}
