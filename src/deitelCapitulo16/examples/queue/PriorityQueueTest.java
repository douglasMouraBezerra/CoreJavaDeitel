package deitelCapitulo16.examples.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

	public static void main(String[] args) {

		Queue<Double> queue = new PriorityQueue<Double>();

		queue.offer(3.2);
		queue.offer(2.2);
		queue.offer(1.4);
		queue.offer(5.3);

		System.out.printf("removendo ou fazendo polling::");

		while (queue.size() > 0) {
			System.out.printf("%.1f ", queue.peek()); // visualiza elem superior
			queue.poll();// remove elem superior
		}
	}

}
