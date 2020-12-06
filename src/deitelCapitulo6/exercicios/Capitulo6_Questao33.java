package deitelCapitulo6.exercicios;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Modificando Classe craps
 * 
 *
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao33 {

	private static final SecureRandom randomNumbers = new SecureRandom();
	private static Scanner scanner = new Scanner(System.in);

	private enum Status {
		CONTINUE, WON, LOST, EXIT, PLAY
	};

	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	private static double bankBalance = 1000;

	public static void main(String[] args) {
		Status gameStatus = Status.PLAY;

		int myPoint = 0;
		int wager = 0;

		// game loop
		while (gameStatus != Status.EXIT) {

			if (gameStatus != Status.CONTINUE) {
				wager = wager();
				chatMessages();
			}

			int sumOfDice = rollDice();

			switch (sumOfDice) {
			case SEVEN:
			case YO_LEVEN:
				gameStatus = Status.WON;
				bankBalance += wager;
				System.out.printf("\nPlayer %s $%d\n", gameStatus, wager);
				break;
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOST;
				System.out.printf("\nPlayer %s $%d\n", gameStatus, wager);
				bankBalance -= wager;
				break;
			default:
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDice;
				System.out.printf("Point is %d\n", myPoint);
				break;
			}

			if (bankBalance <= 0)
				gameStatus = Status.EXIT;
		}
	}

	public static int rollDice() {

		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);

		int sum = die1 + die2;
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		return sum;
	}

	// inserindo novos metodos
	public static void chatMessages() {
		switch (randomNumbers.nextInt(4)) {
		case 0:
			System.out.println("Descupe, mas você faliu !");
			break;

		case 1:
			System.out.println("Parece que você vai quebrar hein");
			break;

		case 2:
			System.out.println("Vamos lá, dê uma chance para a sorte");
			break;

		case 3:
			System.out.println("Você está montado na grana !");
			break;

		}

	}

	public static int wager() {
		while (true) {
			System.out.println("Digite um weger::");
			int w = scanner.nextInt();

			if (w <= bankBalance) {
				return w;
			}

		}
	}

}
