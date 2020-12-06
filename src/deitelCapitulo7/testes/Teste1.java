package deitelCapitulo7.testes;

import java.util.Arrays;

public class Teste1 {

	public static void main(String[] args) {

		double[] w = new double[99];

		for (int i = 0; i < w.length; i++) {
			w[i] = i * 10 + 9;
		}

		double menor = w[49];
		for (int i = 0; i < w.length; i++) {
			if (w[i] > menor)
				System.out.println("Maiores " + w[i]);
			else
				System.out.println("Menores " + w[i]);
		}

	
		System.out.println(Arrays.toString(w));
	
	}

	
	
	
}
