package deitelCapitulo7.exercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Data: 24/04/2020
 * 
 * @author Douglas
 *
 */
public class Capitulo7_Questao19 //
{
	public static void main(String[] args) //
	{

		boolean[] assentos = new boolean[11];
		Arrays.fill(assentos, false);

		int escolha;
		int contadorPrimeiraClasse = 1;
		int contadorEconomico = 6;
		Scanner entradaTeclado = new Scanner(System.in);

		// ***************************************************

		for (int i = 1; i < assentos.length; i++) {

			System.out.println("Companhia de viagens");
			System.out.println("Digite 1 para primeira classe\nDigite 2 para classe economica.");

			escolha = entradaTeclado.nextInt();

			if (escolha == 2) //
			{
				if ((contadorEconomico > 5 && contadorEconomico <= 10) && assentos[contadorEconomico] == false)//
				{
					assentos[contadorEconomico] = true;
					contadorEconomico++;
				} else//
				{
					System.out.println("Classe economica cheia, deseja ir para\nprimeira classe ?\nDigite 1 ");
					escolha = entradaTeclado.nextInt();

					if (escolha == 1)//
					{
						if ((contadorPrimeiraClasse >= 1 && contadorPrimeiraClasse < 6)
								&& assentos[contadorPrimeiraClasse] == false)//
						{
							assentos[contadorPrimeiraClasse] = true;
							contadorPrimeiraClasse++;

						} else //
						{
							System.out
									.println("Primeira Classe está Lotada tambem.\nProximo onibus sai em três horas.");
						}

					}
				}
			} else if (escolha == 1) //
			{
				if ((contadorPrimeiraClasse >= 1 && contadorPrimeiraClasse < 6)
						&& assentos[contadorPrimeiraClasse] == false) //
				{
					assentos[contadorPrimeiraClasse] = true;
					contadorPrimeiraClasse++;
				} else //
				{
					System.out.println("Primeira classe lotada. Proximo onibus sai em tres horas.");
				}

			}

		}

		for (int i = 1; i < assentos.length; i++) {
			if (i < 6)
				System.out.printf("Primeira classe || Poltrona: %d || Ocupada ? %b%n ", i, assentos[i]);
			else
				System.out.printf("Classe economica || Poltrona: %d || Ocupada ? %b%n ", i, assentos[i]);
		}

		entradaTeclado.close();

	}
}
