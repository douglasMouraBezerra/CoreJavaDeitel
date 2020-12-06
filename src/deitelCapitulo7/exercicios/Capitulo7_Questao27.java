package deitelCapitulo7.exercicios;

import java.util.Arrays;

/**
 * Data: 29/04/2020
 * 
 * @author Douglas
 *
 */
public class Capitulo7_Questao27//
{

	public static void main(String[] args)//
	{

		// cria array
		boolean[] primos = new boolean[1000];

		// preencho o array com true
		Arrays.fill(primos, true);

		// primeiro laco verifica se elemento na posicao de indice e true
		for (int i = 2; i < primos.length; i++) {
			// se e true, outro laco percorre o restante do array
			if (primos[i] == true)
				// laco verifica quais indices restantes sao multiplos de i, laco externo.
				// faz isso para todas as posicoes
				for (int j = i + 1; j < primos.length; j++)
					if (j % i == 0) // se j nao e multiplo de i logo pula essa op, no caso o resto nao pode ser 0
						primos[j] = false;
		}

		// exibindo configuracao apos mudancas
		for (int i = 2; i < primos.length; i++) {
			System.out.println("indice: " + i + "|| valor: " + primos[i]);
		}

	}

}
