package deitelCapitulo6.exercicios;

/**
 * Equivalente em binario, hexadecimal e octal
 * 
 *
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao34 {

	/**
	 * Conversao usando JAVA API
	 * 
	 * @param value
	 * @return
	 */
	public static String binaryConvert(int value) {
		return Integer.toBinaryString(value);
	}

	/**
	 * Conversao usando parte da API
	 * 
	 * @param value
	 * @return
	 */
	public static String decTobinary(int value) {
		int d = value;
		StringBuilder sb = new StringBuilder();

		while (d > 0) {
			int b = d % 2;
			sb.append(b);
			d = d >> 1;
		}

		return sb.reverse().toString();

	}

	/**
	 * Com JAVA API convertendo para octal
	 * 
	 * @param value
	 * @return
	 */
	public static String decToOctal(int value) {
		return Integer.toOctalString(value);
	}

	/**
	 * Retornando Hexadecimal com java api
	 * 
	 * @param value
	 * @return
	 */
	public static String decToHexadecimal(int value) {
		return Integer.toHexString(value);
	}

	public static void main(String[] args) {

		System.out.printf("Dec\tHex\tOct\tBin\n");
		for (int decimal = 1; decimal <= 256; decimal++) {
			System.out.printf("%d\t%s\t%s\t%s\t\n", decimal, decToHexadecimal(decimal), decToOctal(decimal),
					binaryConvert(decimal));
		}

	}

}
