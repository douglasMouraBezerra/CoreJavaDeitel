package deitelCapitulo6.exercicios;

import java.util.Scanner;

/**
 * Conversao de temperatura
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao22 {

	public static double celsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	public static double fahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.printf("Digite:\n1- Calcular celsius\n2- Calcular Fahrenheit\n\n ");

		System.out.print("Informe o valor :");
		int escolha = leia.nextInt();

		switch (escolha) {
		case 1:
			System.out.print("\nInforme a temperatura em fahrenheit: ");
			double f = leia.nextDouble();
			System.out.printf("Conversao para celsius: %.2f", celsius(f));
			break;

		case 2:
			System.out.print("\nInforme a temperatura em celsius: ");
			double c = leia.nextDouble();
			System.out.printf("Conversao para fahrenheit:%.2f ", fahrenheit(c));
			break;
		default:
			System.out.println("OPCAO INVALIDA");
			break;
		}

		leia.close();
	}

}
