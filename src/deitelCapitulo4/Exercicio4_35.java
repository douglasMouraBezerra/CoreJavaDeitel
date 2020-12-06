package deitelCapitulo4;

import java.util.Scanner;

/**
 * 
 * @author Douglas Moura Exercicios - Triangulo
 *
 */
public class Exercicio4_35 {

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
			System.out.printf("%s e um triangulo direito ", "E");
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

}
