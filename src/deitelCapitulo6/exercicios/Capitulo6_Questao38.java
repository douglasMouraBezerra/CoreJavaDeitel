package deitelCapitulo6.exercicios;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Instrucao assistida por computador: contagem de respostas certas e erradas e
 * nível de dificuldade
 * 
 *
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao38 {

	private static SecureRandom ramdonNumbers = new SecureRandom();

	private List<String> sucesso = new ArrayList<String>();
	private List<String> falha = new ArrayList<String>();

	private Scanner s = new Scanner(System.in);

	private int level = 1;

	private int[] valores = new int[2];
	private int resultados = 0;

	public Capitulo6_Questao38() {
		sucesso.add("Muito bom!");
		sucesso.add("Excelente!");
		sucesso.add("Lindo trabalho!");
		sucesso.add("Mantenha o bom trabalho!");

		falha.add("Nao. Tente novamente.");
		falha.add("Errado. tente mais uma vez.");
		falha.add("Não desista.");
		falha.add("Nao. Continue tentando.");

	}

	public void run() {
		showMenu();
	}

	private void setLevel(int level) {
		this.level = level;
	}

	public void showMenu() {
		System.out.println();
		System.out.println("Level 1");
		System.out.println("Level 2");

		setLevel(s.nextInt());

		if (level < 1 || level > 2)
			showMenu();
	}

	/**
	 * Define e armazena 2 digitos aleatorios (a questao)
	 */
	private void setPergunta() {
		int[] difficults = { 9, 99 };
		valores[0] = 1 + ramdonNumbers.nextInt(difficults[level - 1]);
		valores[1] = 1 + ramdonNumbers.nextInt(difficults[level - 1]);

	}

	public void getPergunta() {
		System.out.printf("Quanto e %d * %d ? ", valores[0], valores[1]);
	}

	public void getResultados() {
		System.out.printf("\nSeus resultados são de: %d", resultados);

		if (resultados >= (10 * 0.75))
			System.out.println("Parabéns, você está pronto para avançar para o próximo nível!");
		else
			System.out.println("Peça ajuda extra ao seu professor.");
	}

	/**
	 * Reseta a pergunta e envia uma nova
	 */
//	public void novaPergunta() {
//		setPergunta();
//		getPergunta();
//	}

	/**
	 * Checa a resposta, e imprime o retorno adequado
	 * 
	 * @param r
	 */
	public void verificaResposta(int r) {
		if (r == valores[0] * valores[1]) {
			System.out.println(sucesso.get(ramdonNumbers.nextInt(sucesso.size())));
			setPergunta();
			++resultados;
		} else {
			System.out.println(falha.get(ramdonNumbers.nextInt(falha.size())));
		}

	}

	/**
	 * Reseta contagem e inicia novo jogo
	 */
	public void reset() {
		resultados = 0;
		setPergunta();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Capitulo6_Questao38 questao38 = new Capitulo6_Questao38();

		int contador = 0;
		char cont = 's';

		while (cont == 's') {
			
			
			questao38.run();

			// loop interno com tamanho dez para fazermos as perguntas
			while (contador != 10) {
				questao38.getPergunta();
				questao38.verificaResposta(scanner.nextInt());

				contador++;
			}

			questao38.getResultados();

			System.out.print("Continue ? (s / n)");
			cont = scanner.next().charAt(0);

			if (cont == 's')
				contador = 0;

			questao38.reset();
		}

		scanner.close();

	}

}
