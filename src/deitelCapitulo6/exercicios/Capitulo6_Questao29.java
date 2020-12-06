package deitelCapitulo6.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Cara ou coroa
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao29 {

	private static Random random = new Random();

	private enum Coin {
		HEADS, TAILS
	};

	/**
	 * tosscoin - opcao lanca moeda conta numero de vezes que cada lado aparece
	 */
	public static void start() {

		int frequencyH = 0;// frequencia de heads
		int frequencyT = 0;// frequencia de tails
		int count = 0; // quantos lancamentos feitos
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("1- Toss Coin");
			System.out.println("5 - exit");

			int value = input.nextInt();

			if (value == 5)
				break;

			switch (flip()) {
			case HEADS:
				++frequencyH;
				break;

			case TAILS:
				++frequencyT;
				break;

			}

			++count;

		}

		System.out.printf("\nNumero Lancamentos: %d\nHEADS: %d\nTAILS: %d\n", count, frequencyH, frequencyT);

		input.close();

	}

	/**
	 * Metodo retorna Heads se resultado for 0 ou teils se for 1
	 * 
	 * @return
	 */
	public static Coin flip() {
		return (random.nextInt(2) == 0) ? Coin.HEADS : Coin.TAILS;
	}

	public static void main(String[] args) {

		start();

	}

}
