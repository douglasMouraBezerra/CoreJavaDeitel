package deitelCapitulo4;

import java.util.Scanner;

/**
 * 
 * @author Douglas Moura Exercicios - Palíndronos
 *
 */
public class Exercicio4_30 {


	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Informe um Palindrono de cinco digitos:");
		String palindrono = s.next();

		while (palindrono.length() != 5) {
			System.out.println("Entrada invalida:");
			System.out.print("Cinco digitos apenas: ");
			palindrono = s.next();
		}

		StringBuilder builder = new StringBuilder(palindrono);

		if (palindrono.equalsIgnoreCase(builder.reverse().toString()))
			System.out.println("É um Palindrono");
		else
			System.out.println("Não é Palíndrono");

		s.close();

		
	}
}
