package deitelCapitulo7.exercicios;

import java.util.Random;

/**
 * Data: 11/05/2020
 * 
 * @author Douglas
 *
 */
public class Capitulo7_Questao28 //
{
	public static void main(String[] args)//
	{
		Random random = new Random();

		// array contem valores das posicoes tartatura e lebre
		int[] posicao = new int[2];
		int tartaruga = 1;
		int lebre = 1;
		int i;
		int nt, nl;

		System.out.println("BANG !!!!\nE LA VAO ELES !!!!");
		for (i = 1; i < 70; i++)//
		{
			nt = 1 + random.nextInt(9);
			nl = 1 + random.nextInt(9);

			// regras tartaruga
			if (nt == 1)
				posicao[0] += tartaruga;
			else if (nt >= 8 && nt <= 10)
				posicao[0] = tartaruga += 1; // caminhanda lenta
			else if (nt >= 1 && nt <= 5) // caminhada rapida
				posicao[0] = tartaruga += 3;
			else
				posicao[0] = tartaruga -= 6; // escorregao

			// regras lebre
			if (nl == 1)
				posicao[1] = lebre; // start lebre
			else if (nl >= 8 && nl <= 10)
				posicao[1] = lebre += 2; // escorregao pequeno
			else if (nl >= 6 && nl <= 7)
				posicao[1] = lebre += 1; // salto pequeno
			else if (nl >= 4 && nl <= 5)
				posicao[1] = lebre -= 12; // escorregao grande
			else if (nl >= 2 && nl <= 3)
				posicao[1] = lebre += 9; // salto grande
			else
				posicao[1] = lebre += 0;

		}

		if (lebre >= 70) {
			System.out.println("LEBRE GANHOU.OH");
			System.out.println(posicao[1]);
		} else if (tartaruga >= 70) {
			System.out.println("TARTARUGA  GANHOU.OH");
			System.out.println(posicao[0]);
		}else if(lebre < 70 || tartaruga < 70) {
			System.out.println("SEM GANHADORES");
		}

	}
}
