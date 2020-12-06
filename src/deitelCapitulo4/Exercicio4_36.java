package deitelCapitulo4;

import java.util.Scanner;

/**
 * 
 * @author Douglas Moura Exercicios - Triangulo direito
 *
 */
public class Exercicio4_36 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int a, b, c;

		System.out.print("Info lado a:");
		a = entrada.nextInt();

		System.out.print("Info lado b:");
		b = entrada.nextInt();

		System.out.print("Info lado c:");
		c = entrada.nextInt();

		if (eTriangulo(a, b, c))
			System.out.printf("%s e um triangulo direito ", eTrianguloDireito(a, b, c) ? "" : "NOT");
		else
			System.out.println("Não pode formar um triangulo");

		entrada.close();

	}

	// verifica se e triangulo
	public static boolean eTriangulo(int a, int b, int c) {
		if ((a < b + c) && (b < c + a) && (c < a + b))
			return true;
		else
			return false;
	}

	// verifica se e um triangulo direito valido
	public static boolean eTrianguloDireito(int a, int b, int c) {
		int hipotenusa;
		boolean result;

		if (a > b && a > c) {
			hipotenusa = a;
			result = (Math.pow(hipotenusa, 2) == Math.pow(b, 2) + Math.pow(c, 2));
		} else if (b > a && b > c) {
			hipotenusa = b;
			result = (Math.pow(hipotenusa, 2) == Math.pow(a, 2) + Math.pow(c, 2));
		} else {
			hipotenusa = c;
			result = (Math.pow(hipotenusa, 2) == Math.pow(a, 2) + Math.pow(b, 2));
		}

		return result;
	}

}
