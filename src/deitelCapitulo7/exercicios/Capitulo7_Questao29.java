package deitelCapitulo7.exercicios;

import java.util.Scanner;

/**
 * Data: 12/05/2020
 * 
 * @author Douglas
 *
 */
public class Capitulo7_Questao29 //
{
	public static void calculaFibo(int n) {
		int a = 1;
		int b = 0;
		int aux;
		for (int i = 0; i < n; i++) {
			System.out.println(a);
			aux = a;
			a += b;
			b = aux;
		}

	}

	public static void main(String[] args)//
	{
		Scanner n = new Scanner(System.in);

		System.out.println("Informe um numero para ser calculado a sequencia de fobonacci:  ");

		calculaFibo(n.nextInt());

		n.close();

	}

}