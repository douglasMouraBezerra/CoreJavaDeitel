package deitelCapitulo6.exercicios;

/**
 * Maximo divisor comum usando algoritmo de EuclidesCapitulo6_Questao26.java
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao27 {

	public static int mdc(int a, int b) {
		int r = 0;
		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println(mdc(10, 2));
	}

}
