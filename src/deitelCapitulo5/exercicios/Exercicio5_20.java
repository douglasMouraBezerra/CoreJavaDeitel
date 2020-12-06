package deitelCapitulo5.exercicios;

/**
 * Calculando vendas de produtos
 * 
 * @author Douglas
 *
 */
public class Exercicio5_20 {

	public static void main(String[] args) {
		double pi = 0.0;
		int termos = (args.length == 0) ? 10 : Integer.parseInt(args[0]);

		for (int i = 0; i < termos; i++)
			pi += ((i % 2 == 1) ? -1.0 : 1.0) / (2.0 * i + 1.0);

		System.out.println("O Valor de Pi com " + termos + " termos eh : " + (4.0 * pi));
		
		System.out.println("\nPi: " + Math.PI);
	}
}