package deitelCapitulo6.exemplos;

import java.util.Random;

public class Craps {

	private static Random random = new Random();

	private enum Status {
		CONTINUE, WON, LOST
	};

	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public void play() {

		int myPoint = 0; // pontuacao se ganhar ou perder
		Status gameStatus;// pode contar won, lost or continue

		int sumOfDice = rollDice();

		switch (sumOfDice) {
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
			break;

		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOST;
			break;

		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice; // info pontuacao
			System.out.printf("Minha pontuacao é : %d\n", myPoint);
			break;
		}

		while (gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice(); // lanca dados novamente

			if (sumOfDice == myPoint)
				gameStatus = Status.WON;

			else if (sumOfDice == SEVEN)
				gameStatus = Status.LOST;
		}

		// da a informacao se ganhou ou nao
		if (gameStatus == Status.WON)
			System.out.printf("%s\n", "Jogador Venceu");
		else
			System.out.printf("%s\n", "Jogador Perdeu");
	}

	public int rollDice() {
		int number1 = 1 + random.nextInt(6);
		int number2 = 1 + random.nextInt(6);

		int sum = number1 + number2;

		System.out.printf("Jogador lancou %d + %d = %d\n", number1, number2, sum);

		return sum;
	}

}
