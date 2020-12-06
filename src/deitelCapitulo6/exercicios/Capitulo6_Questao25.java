package deitelCapitulo6.exercicios;

/**
 *
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao25 {

	/**
	 * Metodo recebe um numero e retorna se é primo
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isCousin(int number) {
		if (number == 1) // se 1 - false
			return false;
		else {
			for (int i = 2; i < number; i++)
				if (number % i == 0) // caso tenha uma divisao de resto zero entre dois e o numero passado, logo nao
										// e primo
					return false;
		}
		return true;
	}

	public static void main(String[] args) {

		for (int i = 2; i <= 10; i++) {
			System.out.printf("%d e primo ? %b\n", i, isCousin(i));
		}
	}

}
