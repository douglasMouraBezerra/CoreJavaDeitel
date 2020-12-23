package deitelCapitulo16.exercises;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Exercicio onde a ordem natural dos elementos da PriorityQueue deve ser
 * decrescente
 * 
 * @author Douglas
 *
 */
public class PriorityQueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// aqui adicionamos o que o exercicio pede
		// alterando a ordem de prioridade dos elementos com o comparator de
		// Collections.
		PriorityQueue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

		// insere elementos na fila
		queue.offer(3.2);
		queue.offer(9.8);
		queue.offer(5.4);

		System.out.print("Polling from queue: ");

		// exibe elementos na fila
		while (queue.size() > 0) {
			System.out.printf("%.1f ", queue.peek()); // visualiza o elemento superior
			queue.poll(); // remove o elemento superior
		}

	}

}
