package deitelCapitulo4;

import java.util.Scanner;

public class Exercicio4_17 {
	public static void main(String[] args) {

		System.out.println("*****************************");
		System.out.println("Quilometragem de combustivel:");
		System.out.println("*****************************");

		Scanner scanner = new Scanner(System.in);
		int km;
		int litros;
		int contador = 1;
		double consumo = 0;

		while (contador != -1) {
			System.out.print("Informe a quantos quilometros percorreu:");
			km = scanner.nextInt();

			System.out.print("Informe a quantos litros gastou:");
			litros = scanner.nextInt();

			consumo = (double) km / litros; // op coercao cria double temporario em memória
			System.out.printf("\nQuilometragem: %d\nLitros: %d\nO consumo foi de %.2f litros por quilometro.\n", km,
					litros, consumo);

			System.out.println("Deseja continuar ? ");
			System.out.println("Pressione -1 para sair");
			System.out.println("Pressione um numero inteiro positivo para continuar:");
			contador = scanner.nextInt();
		}
		System.out.println("FIM DO PROGRAMA");
		scanner.close();

	}
}
