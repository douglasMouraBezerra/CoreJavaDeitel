package deitelCapitulo4;

import java.util.Scanner;

/**
 * 
 * @author Douglas
 * 
 */
public class Exercicio4_24 {

	public static void main(String[] args) {

		int contador = 1;
		int resultado = 0;
		int pass = 0;
		int fail = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("*************************************************");
		System.out.println("********PROGRAMA DE APROVACAO E REPROVACAO*******");
		System.out.println("*************************************************");

		while (contador <= 10) {
			do {
				System.out.print("(Enter 1 - Pass or 2 - Fail)");
				resultado = entrada.nextInt();
				
				if (resultado == 1) {
					pass++;
				} else if (resultado == 2) {
					fail++;
				}

			} while (resultado < 1 || resultado > 2);

			contador++;

		}
		System.out.printf("Pass: %d\nFail:%d\n", pass, fail);

		if (pass >= 8) {
			System.out.println("Bonus to instructor !!!");
		}

		entrada.close();
	}
}
