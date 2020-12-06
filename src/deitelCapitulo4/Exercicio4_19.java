package deitelCapitulo4;

import java.util.Scanner;

public class Exercicio4_19 {
	public static void main(String[] args) {

		int count = 1;
		Scanner input = new Scanner(System.in);
		do {
			int aux = 1;
			int countItens = 0;
			double somaItens = 0;
			double ganhoSemanal = 200;
			String nome;

			System.out.println("Digite seu nome: ");
			nome = input.next();

			while (aux != 0) {
				System.out.println("\nQTD Itens: ");
				int item = input.nextInt();
				countItens += item;

				System.out.println("Valor dos Itens: ");
				double valueItens = input.nextDouble();
				somaItens += valueItens;

				System.out.println("Deseja continuar ? 1 - Sim / 0-Nao ");
				aux = input.nextInt();
			}

			ganhoSemanal += (somaItens * 9) / 100;

			System.out.printf(
					"\nNome: %s\nQuantidade de Itens Vendidos: %d\nSoma dos Itens: %.2f\nGanho Semanal: %.2f\n", nome,
					countItens, somaItens, ganhoSemanal);

			System.out.println("Deseja continuar ? 1- Sim / -1 - Nao");
			count = input.nextInt();

		} while (count != -1);
		input.close();
	}
}
