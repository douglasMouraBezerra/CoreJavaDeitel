package deitelCapitulo5.exercicios;

/**
 * Leis de Morgan - Facilitando escrita de expressoes lógicas
 * 
 * @author Douglas
 *
 */
public class Exercicio5_23 {

	public static void main(String[] args) {

		int x = 1, y = 10;

		System.out.printf("Original: %b\n", !(x < 5) && !(y >= 7));
		System.out.printf("Resultado: %b\n", ((!(x < 5)) && (!(y >= 7))));
		System.out.printf("Resultado: %b\n", ((!(x < 5)) || (!(y >= 7))));

		System.out.println();

		int a = 1, b = 1, g = 3;
		System.out.printf("Original: %b\n", !(a == b) || !(g != 5));
		System.out.printf("Modificado: %b\n", !((a == b) && (g != 5)));

		System.out.println();

		System.out.printf("Original: %b\n", !((x <= 8) && (y > 4)));
		System.out.printf("Modificado: %b\n", !(x <= 8) || !(y > 4));

		System.out.println();
		int i = 5, j = 2;
		System.out.printf("Original: %b\n", !((i > 4) || (j <= 6)));
		System.out.printf("Modificado: %b\n", !(i > 4) && !(j <= 6));
	}
}