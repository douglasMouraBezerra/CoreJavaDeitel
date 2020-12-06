package deitelCapitulo4;

import java.util.Scanner;

public class Exercicio4_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int largest = 0;

		int count = 1;
		while (count <= 10) {
			System.out.println("INFORME UMA QUANTIDADE VENDIDA:::");
			int number = input.nextInt();

			if (number > largest) {
				largest = number;
			}

			System.out.println("NUMERO INSERIDO: " + number + " POSICAO: " + count);

			count++;
		}

		System.out.printf("\nMAIOR NUMERO FOI: " + largest);

		input.close();
	}
}
