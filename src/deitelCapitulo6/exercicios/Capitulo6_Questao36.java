package deitelCapitulo6.exercicios;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Instrucao assistida por computador: reduzindo a fadiga do aluno
 * 
 *
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao36 {

	private static SecureRandom ramdonNumbers = new SecureRandom();

	/**
	 * Metodo retorna uma mensagem diferente para cada resposta positiva
	 */
	private static void positiveAnswers() {
		int p = ramdonNumbers.nextInt(3);

		switch (p) {
		case 0:
			System.out.println("Muito bom!");
			break;

		case 1:
			System.out.println("Excelente!");
			break;

		case 2:
			System.out.println("Bom trabalho!");
			break;

		case 3:
			System.out.println("Mantenha um bom trabalho!");
			break;
		}
	}

	/**
	 * Metodo retorna uma mensagem diferente para cada resposta negativa
	 */
	private static void negativeAnswers() {
		int p = ramdonNumbers.nextInt(3);

		switch (p) {
		case 0:
			System.out.println("Não. Por favor, tente de novo.");
			break;

		case 1:
			System.out.println("Errado. Tente mais uma vez.");
			break;

		case 2:
			System.out.println("Não desista!");
			break;

		case 3:
			System.out.println("Não. Continue tentando.");
			break;
		}
	}

	private static void makingQuestions(int n1, int n2) {
		System.out.printf("Quanto e %d x %d ?\n Informe sua resposta:", n1, n2);
	}

	public static void play() {
		Scanner scanner = new Scanner(System.in);

		int contadorDePerguntas = 1;

		while (contadorDePerguntas <= 10) {
			int n1 = 1 + ramdonNumbers.nextInt(8);
			int n2 = 1 + ramdonNumbers.nextInt(8);
			int calc = n1 * n2;

			while (true) {

				makingQuestions(n1, n2); // chama metodo que faz as perguntas

				System.out.println("Informe o resultado");
				int resposta = scanner.nextInt(); // le a resposta

				if (resposta == calc) { // verifica o resultado
					positiveAnswers(); // para resposta corretas
					break;// sai do laco mais interno
				} else {
					negativeAnswers();// respostas incorretas
				}
			}

			contadorDePerguntas++; // quando chegar em dez ele para de fazer perguntas

		}

		scanner.close();
	}

	public static void main(String[] args) {

		play();

	}

}
