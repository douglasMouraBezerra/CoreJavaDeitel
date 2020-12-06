package deitelCapitulo2;

import java.util.Scanner;

/**
 * Exercicio cap 2 questao 17 Deitel Java Como Programar
 * 
 * @author Douglas
 *
 */
public class Exercicio2_17 {

	public static void main(String[] args) {
		// begin

		int n1, n2, n3;
		int soma, media, produto;
		int maior, menor, meio;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter first number: ");
		n1 = s.nextInt();

		System.out.print("Enter second number: ");
		n2 = s.nextInt();

		System.out.print("Enter second number: ");
		n3 = s.nextInt();

		// verificacao de quem e maior
		if (n1 < n2 && n1 < n3) {
			menor = n1;
		} else if (n2 < n1 && n2 < n3) {
			menor = n2;
		} else {
			menor = n3;
		}

		if (n1 > n2 && n1 < n3) {
			meio = n1;
		} else if (n2 > n1 && n2 < n3) {
			meio = n2;
		} else {
			meio = n3;
		}

		if (n1 > n2 && n1 > n3) {
			maior = n1;
		} else if (n2 > n1 && n2 > n3) {
			maior = n2;
		} else {
			maior = n3;
		}

		soma = n1 + n2 + n3;
		produto = n1 * n2 * n3;
		media = soma / 3;

		System.out.printf("Maior:%d\nMenor:%d\nMeio:%d\nSoma:%d\nProduto:%d\nMedia:%d\n", maior, menor, meio, soma,
				produto, media);

		s.close(); // close

	}// fim main
}// fim class
