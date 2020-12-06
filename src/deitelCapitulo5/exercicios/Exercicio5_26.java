package deitelCapitulo5.exercicios;

/**
 * 
 * 
 * @author Douglas
 *
 */
public class Exercicio5_26 {

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			System.out.println(i); // nao imprime 10, pois quando e verificado que e 9, o valor vai para 11
									// transformando a condicao de continuacao do loop em false
			if (i == 9) {
				i = 11;
			}
		}

	}
}