package deitelCapitulo5.exercicios;

import java.util.Scanner;

/**
 * Calculando vendas de produtos
 * 
 * @author Douglas
 *
 */
public class Exercicio5_17 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		int i = 1;
		int nProduto;
		int qProduto;

		while (i != -1) {
			double totalProduto = 0;
			System.out.print("Numero do produto: ");
			nProduto = e.nextInt();

			System.out.print("Quantidade produto: ");
			qProduto = e.nextInt();

			switch (nProduto) {
			case 1:
				totalProduto += (2.98 * qProduto);
				break;

			case 2:
				totalProduto += (4.50 * qProduto);
				break;

			case 3:
				totalProduto += (9.98 * qProduto);
				break;

			case 4:
				totalProduto += (4.49 * qProduto);
				break;

			case 5:
				totalProduto += (6.87 * qProduto);
				break;

			default:
				System.out.println("Numero de produto invalido");
				break;
			}
			System.out.printf("\nProduto: %d\nQuantidade vendida: %d\nTotal vendido: %.2f\n", nProduto, qProduto,
					totalProduto);

			System.out.print("Deseja parar ? Digite -1");
			i = e.nextInt();

		}
		System.out.println("Fim do Programa");
		e.close();
	}

}
