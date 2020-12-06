package deitelCapitulo7.exercicios;

import java.util.Scanner;

public class Capitulo7_Questao10 {

	public static void main(String[] args) {

		int[] frequencia = new int[9];

		Scanner entrada = new Scanner(System.in);
		int comissao;

		while (true) {

			System.out.print("Informe uma comissao : [Pressione -1 para sair]");
			comissao = entrada.nextInt();

			if (comissao < 0)
				break;

			if (comissao < 200)
				continue;

			if (comissao > 1000)
				comissao = 1000;

			++frequencia[(comissao / 100) - 2]; // pra cada posicao, diminui dois e acrescenta 1

		}

		System.out.println("Saida dos Resultados:::");
		for (int i = 0; i < frequencia.length; i++) {
			if (i == 8)
				System.out.printf("%d00 - %d\n ", i + 2, frequencia[i]);
			else
				System.out.printf("$%d00-$%d99: %d\n", i + 2, i + 2, frequencia[i]);
		}

		entrada.close();

	}

}
