package deitelCapitulo7.examples;

import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {

		SecureRandom randomNumbers = new SecureRandom();

		int[] frequency = new int[7]; // array armazena as frequencias contadas

		for (int roll = 1; roll <= 6000; roll++)
			++frequency[1 + randomNumbers.nextInt(6)];// calcula random e adiciona 1 ao elemento interno

		System.out.printf("%s%10s%n", "Face", "Frequency");

		for (int face = 1; face < frequency.length; face++)
			System.out.printf("%4d%10d%n", face, frequency[face]);

	}

}
