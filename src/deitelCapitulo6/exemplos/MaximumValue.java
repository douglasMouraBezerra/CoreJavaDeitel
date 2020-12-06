package deitelCapitulo6.exemplos;

import java.util.Scanner;

public class MaximumValue {

	public void maximumValue() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe tres valores para\nverificacao do maior.\nDigitar numeros e por espaços:");
		double n1 = entrada.nextDouble();
		double n2 = entrada.nextDouble();
		double n3 = entrada.nextDouble();

		double nMax = maximum(n1, n2, n3);

		System.out.println("O maior valor é: " + nMax);

		entrada.close();

	}

	/**
	 * Metodo verifica qual numero é o maior
	 * 
	 * @param n1
	 * @param n2
	 * @param n3
	 * @return
	 */
	private double maximum(double n1, double n2, double n3) {
		return (Math.max(n1, Math.max(n2, n3)));
	}

	public static void main(String[] args) {

		MaximumValue value = new MaximumValue();
		value.maximumValue();

	}

}
