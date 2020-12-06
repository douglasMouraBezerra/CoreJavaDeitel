package deitelCapitulo6.exercicios;

import java.util.Scanner;

/**
 * Classe calcula o valor do estacionamento em um dado dia, para cada cliente
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao8 {

	public void calculaEstacionamento() {
		Scanner entrada = new Scanner(System.in);
		double totalDoDia = 0;
		String calcular = "sim";

		while (calcular.equalsIgnoreCase("sim")) {
			System.out.print("Info nome do cliente: ");
			String clientName = entrada.next();

			System.out.print("Qtd horas estacionamento: ");
			int horas = entrada.nextInt();

			double calculoCliente = calculaCharges(horas);
			totalDoDia += calculoCliente;

			System.out.printf("\nNome do cliente: %s\nValor: %.2f\n", clientName, calculoCliente);

			System.out.println("Deseja continuar o calculo ?");
			calcular = entrada.next();

		}

		System.out.printf("total de ganhos do dia : %.2f\n", totalDoDia);

		entrada.close();

	}

	/**
	 * Metodo que calcula o valor de acordo com as horas de estacionamento min - 3
	 * 
	 * horas = 2 reais max - 24 horas = 10 reais
	 * 
	 * other cases - cada hora alem das tres mais 0.50 por hora
	 * 
	 * @param horas
	 * @return
	 */
	private double calculaCharges(int horas) {
		double calculo = 0;
		if (horas <= 3)
			calculo += 2;

		else if (horas == 24)
			calculo += 10;

		else {
			double resto = horas - 3;
			calculo += 2 + (resto * 0.50);
		}

		return calculo;
	}

	public static void main(String[] args) {

		Capitulo6_Questao8 capitulo6_Questao8 = new Capitulo6_Questao8();
		capitulo6_Questao8.calculaEstacionamento();
		
	}

}
