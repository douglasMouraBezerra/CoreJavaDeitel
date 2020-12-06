package deitelCapitulo5.exercicios;

/**
 * Triplo de Pitágoras
 * 
 * @author Douglas
 *
 */
public class Exercicio5_21 {

	public static void main(String[] args) {

		int calcSide1;
		int calcSide2;
		int calcHipotenuse;

		for (int side1 = 1; side1 <= 500; side1++) {
			for (int side2 = 1; side2 <= 500; side2++) {
				for (int hipotenuse = 1; hipotenuse <= 500; hipotenuse++) {
					calcSide1 = (int) Math.pow(side1, 2);
					calcSide2 = (int) Math.pow(side2, 2);
					calcHipotenuse = (int) Math.pow(hipotenuse, 2);

					if ((calcSide1 + calcSide2) == calcHipotenuse) {
						System.out.printf("Side1: %d , Side2: %d , Hipotenuse: %d \n", calcSide1, calcSide2,
								calcHipotenuse);
					}

				}
			}
		}

	}
}