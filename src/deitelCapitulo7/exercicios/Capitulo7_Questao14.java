package deitelCapitulo7.exercicios;

/**
 * Classe que com metodo product que receb uma lista de argumentos de
 * comprimento variavel, calcula o produto dos argumentos e retorna o valor
 * 
 * Data: 22/04/2020
 * 
 * @author Douglas
 *
 */
public class Capitulo7_Questao14 {

	public static int product(int... value) {
		int produto = 1;
		for (int i = 0; i < value.length; i++) {
			produto *= value[i];
		}
		return produto;
	}

	public static void main(String[] args) {

		System.out.println("Tres valores: " + product(1, 2, 3));
		System.out.println("Quatro valores: " + product(1, 2, 3, 4));
		System.out.println("Cinco valores: " + product(1, 2, 3, 4, 5));

	}

}