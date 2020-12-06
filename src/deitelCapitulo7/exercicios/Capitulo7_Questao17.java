package deitelCapitulo7.exercicios;

import java.security.SecureRandom;

/**
 * Classe que verifica a frequencia com que a soma de valor de dois dados
 * lancados aleatoriamente aparecem
 * 
 * Data: 24/04/2020
 * 
 * @author Douglas
 *
 */
public class Capitulo7_Questao17 {

	public static void main(String[] args) {

		SecureRandom random = new SecureRandom();
		int dado1;
		int dado2;
		int soma;
		int[] frequencia = new int[13];

		// somar os dados e adicionar ao array de frequencia
		for (int i = 0; i < 36000; i++) // fazendo com numero menor, evitar trabamentos
		{
			// lanca o dado a cada iteracao
			dado1 = 1 + random.nextInt(6);
			dado2 = 1 + random.nextInt(6);

			// soma o resultado
			soma = dado1 + dado2;

			// atribui ao array de frencia
			++frequencia[soma];
		}

		System.out.printf("%s%13s\n", "Sum", "total");
		// exibindo as frequencias
		for (int i = 2; i < frequencia.length; i++) //
		{
			System.out.printf("%2d : %15d%n", i, frequencia[i]);
		}

	}

}