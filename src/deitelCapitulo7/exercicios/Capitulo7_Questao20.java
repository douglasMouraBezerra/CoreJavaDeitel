package deitelCapitulo7.exercicios;

import java.util.Random;

/**
 * Data: 28/04/2020
 * 
 * @author Douglas
 *
 */
public class Capitulo7_Questao20 
{

	private static final int VENDEDORES = 4;
	private static final int PRODUTOS = 5;

	public static void main(String[] args) 
	{

		Random randomGenerator = new Random();

		//array com produtos apenas
		int[][] vendas = new int[PRODUTOS][];

		//criando vendedores
		for (int i = 0; i < vendas.length; i++)
			vendas[i] = new int[4]; // cada linha 4 colunas representando os vendedores

		//populando array com numeros aleatorios
		for (int linha = 0; linha < vendas.length; linha++)
			for (int coluna = 0; coluna < vendas[linha].length; coluna++)
				vendas[linha][coluna] = 1 + randomGenerator.nextInt(999);

		//exibindo resutados
		exibindoTotal(vendas);

	}

	public static void exibindoTotal(int[][] array)
	{
		System.out.printf("%5s\t%5d%6d%7d%6d%9s%n","Prod", 1, 2, 3, 4, "Total");

		int totalLinha = 0;
		int totalColumn = 0;

		// calculando o total, linhas e colunas
		for (int linha = 0; linha < array.length; linha++)
		{
			System.out.printf("%5d\t", linha + 1);
			totalLinha = 0;
			totalColumn = 0;

			for (int coluna = 0; coluna < array[linha].length; coluna++)
			{
				System.out.printf("%6d", array[linha][coluna]);
				totalLinha += array[linha][coluna];
			}

			System.out.printf("%9d", totalLinha);
			System.out.println();
		}

		// calculando o total apenas dos vendedores
		System.out.printf("\n%8s ", "Total");
		for (int coluna = 0; coluna < VENDEDORES; coluna++) 
		{
			for (int linha = 0; linha < array.length; linha++)
			{
				totalColumn += array[linha][coluna];
			}

			System.out.printf("%6d", totalColumn);
			totalColumn = 0;

		}
		System.out.println();
	}
}
