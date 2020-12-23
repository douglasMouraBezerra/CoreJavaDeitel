package deitelCapitulo16.exercises;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * 
 * 16.17 - Trabalhando com LinkedLists
 * 
 * @author Douglas
 *
 */
public class LinkedListInsertion {

	public static void main(String[] args) {

		Random random = new Random();
		List<Integer> integers = new LinkedList<Integer>();

		for (int i = 0; i < 25; i++) {
			int valor = random.nextInt(100);
			integers.add(valor);
		}

		// classificando
		Collections.sort(integers);

		System.out.print("Elementos classificados: ");
		for (Integer elems : integers) {
			System.out.print(elems + " ");
		}

		int soma = 0;
		double media = 0;

		for (Integer value : integers) {
			soma += value;
		}

		// fazendo cast pra nao zerar a parte fracionada
		media = (double) soma / integers.size();

		System.out.println("\nSoma dos valores: " + soma);
		System.out.println("Media dos valores: " + media);

	}

}
