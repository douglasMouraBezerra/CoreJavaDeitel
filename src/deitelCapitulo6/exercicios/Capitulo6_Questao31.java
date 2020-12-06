package deitelCapitulo6.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Adivinhacao de numero com quantidade de tentativas
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int qtdTentativas = 0;

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

			qtdTentativas++;

		}

		if (qtdTentativas <= 10)
			System.out.println("Você sabe o segredo ou teve muita sorte");
		else if (qtdTentativas == 10)
			System.out.println("Aha ! Você sabe o segredo");
		else if (qtdTentativas > 10) {
			System.out.println("Você deve ser capaz de fazer melhor");
		}

		System.out.printf("\nQuantidade de tentativas: %d ", qtdTentativas);

		input.close();

	}

}
