package deitelCapitulo6.exercicios;

import java.util.Scanner;

/**
 * Classe usada para reprensentar o metodo estatico floor() da classe Math
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao9 {

	public double arredondamento(double value) {
		return Math.floor(value);
	}

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int count = 1;
		Capitulo6_Questao9 c = new Capitulo6_Questao9();

		System.out.print("infore quantos numeros quer inserir: ");
		int qtdNumber = e.nextInt();

		while (count <= qtdNumber) {
			System.out.println("informe um numero: ");
			double n_informado = e.nextDouble();

			System.out.printf("%.2f para %.2f com Math.floor(x)\n", n_informado, c.arredondamento(n_informado));

			count++;
		}

		e.close();
	}

}
