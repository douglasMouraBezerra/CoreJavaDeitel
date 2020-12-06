package deitelCapitulo6.exercicios;

/**
 * Retornarndo a distancia entre dois pontos no plano
 * 
 * distancia(A,B) = V(x2 - x1) ^2 + (y2 - y1)^2
 * 
 * @author Douglas de Moura
 *
 */
public class Capitulo6_Questao32 {

	/**
	 * 
	 * Metodo recebe as coordenadas, calcula e retorna a distancia entre os pontos
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return {@link Double}
	 */
	public static double distanciaEntrePontos(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

	}

	public static void main(String[] args) {

		System.out.printf("A distancia entre os pontos e de: %.2f", distanciaEntrePontos(4, 1, 1, 3));

	}

}
