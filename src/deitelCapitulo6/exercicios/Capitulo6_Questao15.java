package deitelCapitulo6.exercicios;

import java.util.Scanner;

/**
 * 
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao15 {

	public static double hypotenuse(double side1, double side2) {
		return Math.hypot(side1, side2);
	}

	public static void main(String[] args) {

		int count = 1;
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe os lados do triangulo, para calculo da hipotenusa: ");
		while (count <= 3) {
			System.out.print("Info side1: ");
			double side1 = leia.nextDouble();

			System.out.print("Info side1: ");
			double side2 = leia.nextDouble();

			double hypotenuse = Capitulo6_Questao15.hypotenuse(side1, side2);

			System.out.printf("%d º calculo de hypotenuse : %f + %f = %.2f\n", count, side1, side2, hypotenuse);

			count++;
		}

		leia.close();
	}

}
