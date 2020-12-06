package deitelCapitulo4;

import java.util.Scanner;

public class Exercicio4_20 {
	
	public static void main(String[] args) {

		String resposta = "SIM";
		Scanner input = new Scanner(System.in);
		while (!resposta.equalsIgnoreCase("NAO")) {
			System.out.println("INFORME O SEU NOME: ");
			String nome = input.next();

			System.out.println("QUANTIDADE DE HORAS TRABALHADAS: ");
			int horasT = input.nextInt();

			System.out.println("VALOR SALARIO/HORA:");
			double salarioHora = input.nextDouble();

			double calculoSalarioBruto = 0;

			if (horasT > 40) {
				double restante = (horasT % 40); // pega o excedente
				double valorNormal = horasT - restante; // pega as 40h
				calculoSalarioBruto += (valorNormal * salarioHora) + (restante * (salarioHora * 1.5)); // calculo
			} else if (horasT == 40) {
				calculoSalarioBruto += (horasT * salarioHora);
			}

			// imprimindo valores
			System.out.printf("\nNOME: %s\nSALARIO BRUTO SEMANAL: %.2f\n", nome, calculoSalarioBruto);

			System.out.println("\nDESEJA CONTINUAR ? SIM / NAO [DIGITE]");
			resposta = input.next();
		}
		input.close();
	}
}
