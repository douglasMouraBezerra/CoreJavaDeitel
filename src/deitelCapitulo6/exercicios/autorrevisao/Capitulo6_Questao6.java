package deitelCapitulo6.exercicios.autorrevisao;

import java.util.Scanner;

public class Capitulo6_Questao6 {

	public static double sphereVolume(double raio) {
		return (4.3 / 3.0) * Math.PI * Math.pow(raio, 3);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe raio para calculo do volume da esfera:");
		double raio = scanner.nextDouble();

		System.out.printf("Volume da esfera: %.2f", Capitulo6_Questao6.sphereVolume(raio));

		scanner.close();

	}

}
