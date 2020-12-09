package deitelCapitulo16.examples;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Visualizando arrays como Lists e convertendo Lists em arrays.
 * 
 * @author Doug Funny
 *
 */
public class UsingToArray {

	public static void main(String[] args) {
		String[] cores = { "preto", "azul", "amarelo" };
		LinkedList<String> links = new LinkedList<String>(Arrays.asList(cores));

		links.addLast("vermelho");
		links.add("pink");
		links.add(3, "verde");
		links.addFirst("ciano");

		// obtem elementos do linkedlist como array
		cores = links.toArray(new String[links.size()]);

		System.out.println("cores: ");
		for (String c : cores)
			System.out.println(c);

	}
}
