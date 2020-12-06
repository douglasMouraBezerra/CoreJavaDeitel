package deitelCapitulo7.exercicios;

import java.util.Arrays;

public class Capitulo7_Questao3 {

	private final int ARRAY_SIZE = 10;
	private static double[] a;

	public Capitulo7_Questao3() {
		a = new double[ARRAY_SIZE];
	}

	public void fillArray() {
		Arrays.fill(a, 0);
	}

	public void putIntArray(int index, double value) {
		if (index >= 0 && index < a.length)
			a[index] = value;
	}

	public double sumOfArray() {
		int x = 0;
		for (double d : a)
			x += d;

		return (double) x;
	}

	public void showArray() {
		for (double d : a)
			System.out.println("\n" + d);
	}

	public static void main(String[] args) {

		Capitulo7_Questao3 question = new Capitulo7_Questao3();
		question.fillArray();

		// preenchendo array
		question.putIntArray(9, 1.667);
		question.putIntArray(6, 3.333);

		// soma
		System.out.printf("%nSum of elements: %.3f ", question.sumOfArray());
		
		//array elements
		question.showArray();
		
	}

}
