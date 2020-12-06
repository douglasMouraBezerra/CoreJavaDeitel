package deitelCapitulo6.exercicios;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Instrucao assistida por computador: contagem de respostas certas e erradas
 * 
 *
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao37 {

	private static SecureRandom ramdonNumbers = new SecureRandom();

	private List<String> sucesso = new ArrayList<String>();
	private List<String> falha = new ArrayList<String>();

	private int[] valores = new int[2];
	private int resultados = 0;

	public Capitulo6_Questao37() {
		sucesso.add("Muito bom!");
		sucesso.add("Excelente!");
		sucesso.add("Lindo trabalho!");
		sucesso.add("Mantenha o bom trabalho!");

		falha.add("Nao. Tente novamente.");
		falha.add("Errado. tente mais uma vez.");
		falha.add("N�o desista.");
		falha.add("Nao. Continue tentando.");

	}

	/**
	 * Define e armazena 2 digitos aleatorios (a questao)
	 */
	private void setPergunta() {
		valores[0] = 1 + ramdonNumbers.nextInt(8);
		valores[1] = 1 + ramdonNumbers.nextInt(8);
	}

	public void getPergunta() {
		System.out.printf("Quanto e %d * %d ? ", valores[0], valores[1]);
	}

	public void getResultados() {
		System.out.printf("\nSeus resultados s�o de: %d", resultados);

		if (resultados >= (10 * 0.75))
			System.out.println("Parab�ns, voc� est� pronto para avan�ar para o pr�ximo n�vel!");
		else
		System.out.println("Pe�a ajuda extra ao seu professor.");
	}

	/**
	 * Reseta a pergunta e envia uma nova
	 */
	public void novaPergunta() {
		setPergunta();
		getPergunta();
	}

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
		Capitulo6_Questao37 questao37 = new Capitulo6_Questao37();

		int contador = 0;
		char cont = 's';

		while (cont == 's') {

			// loop interno com tamanho dez para fazermos as perguntas
			while (contador != 10) {
				questao37.getPergunta();
				questao37.verificaResposta(scanner.nextInt());

				contador++;
			}

			questao37.getResultados();

			System.out.print("Continue ? (s / n)");
			cont = scanner.next().charAt(0);

			if (cont == 's')
				contador = 0;

			questao37.reset();
		}

		scanner.close();
		
	}

}
