package deitelCapitulo6.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Adivinhacao de numero
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		System.out.println("******Bem vindo ao jogo da adivinhacao*******");
		System.out.println("Escolhendo numero. . .");

		int numeroAleatorio = 1 + random.nextInt(999);

		System.out.println("Numero escolhido !");

		while (true) {
			System.out.println("Escolha um numero entre 1 e 1000");
			int numeroEscolhido = input.nextInt();

			if (numeroEscolhido > numeroAleatorio)
				System.out.println("Muito Alto, tente novamente !");
			else if (numeroEscolhido < numeroAleatorio)
				System.out.println("Muito Baixo, tente novamente !");
			else if (numeroEscolhido == numeroAleatorio) {
				System.out.println("Congratulations !");
				break;
			}

		}

		input.close();

	}

}
