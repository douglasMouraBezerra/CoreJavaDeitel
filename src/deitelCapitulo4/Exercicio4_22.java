package deitelCapitulo4;


public class Exercicio4_22 {

	public static void main(String[] args) {

		int contador = 1;

		System.out.printf("%-12s%-12s%-12s%s\n", "N", "10*N", "100*N", "1000*N");
		while (contador <= 5) {
			System.out.printf("%-12d%-12d%-12d%3d\n", contador, (10 * contador), (100 * contador), (1000 * contador));

			contador++;
		}

	}
}
