package deitelCapitulo6.exercicios;

import java.util.Scanner;

/**
 * Area do circulo
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao20 {

	public static double circleArea(double raio) {
		return (Math.PI * Math.pow(raio, 2));
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Informe o raio: ");
		int raio = leia.nextInt();

		System.out.printf("A area do circulo é de: %.2f", Capitulo6_Questao20.circleArea(raio));

		leia.close();

	}

}
