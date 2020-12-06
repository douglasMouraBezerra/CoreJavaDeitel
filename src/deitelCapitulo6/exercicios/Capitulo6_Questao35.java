package deitelCapitulo6.exercicios;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Instrucao assistida por computador
 * 
 *
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao35 {

	public static void perguntas(int n1, int n2) {
		System.out.printf("Quanto e %d x %d ?\n Informe sua resposta:", n1, n2);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		SecureRandom ramdonNumbers = new SecureRandom();
		int contadorDePerguntas = 1;

		while (contadorDePerguntas <= 10) {
			int n1 = 1 + ramdonNumbers.nextInt(8);
			int n2 = 1 + ramdonNumbers.nextInt(8);
			int calc = n1 * n2;

			while (true) {

				perguntas(n1, n2); // chama metodo que faz as perguntas

				System.out.println("Informe o resultado");
				int resposta = scanner.nextInt(); // le a resposta

				if (resposta == calc) { // verifica o resultado
					System.out.println("Muito Bem");// valor se correto
					break;// sai do laco mais interno
				} else {
					System.out.println("Nao. Por favor,tente denovo"); // valor se errado, continuando a fazer a mesma
																		// pergunta
				}
			}

			contadorDePerguntas++; // quando chegar em dez ele para de fazer perguntas

		}

		scanner.close();

	}

}
