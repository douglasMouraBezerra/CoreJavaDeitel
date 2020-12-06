package deitelCapitulo6.exercicios;

/**
 * Invertendo digitos
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao26 {

	public static String reverso(int number) {
		String numero = String.valueOf(number);
		StringBuilder builder = new StringBuilder(numero);

		return builder.reverse().toString();

	}

	public static void main(String[] args) {
		System.out.print(reverso(1234) + " ");

	}

}
