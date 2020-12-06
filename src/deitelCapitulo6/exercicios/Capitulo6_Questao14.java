package deitelCapitulo6.exercicios;

/**
 * 
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao14 {

	public static int integerPower(int base, int expoente) {

		if (expoente == 1)
			return base;

		if (expoente == 0)
			return 1;

		if (base == 1)
			return base;

		else {
			int aux = 1;
			for (int i = 1; i <= expoente; i++) {
				aux *= base;
			}

			return aux;
		}

	}

	public static void main(String[] args) {

		System.out.printf("inter power : %d", Capitulo6_Questao14.integerPower(2, 3));

	}

}
