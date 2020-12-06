package exemplosCapitulo2;
import java.util.Scanner;

/**
 * 
 * @author Douglas de Moura Bezerra Classeresponsavel por fazer o calculo do
 *         produto de três numeros informados pelo usuario. Deitel - Java Como
 *         Programar.
 *
 */
public class Product {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x, y, z, result;

		System.out.print("Enter first number: ");
		x = input.nextInt();

		System.out.print("Enter second number: ");
		y = input.nextInt();

		System.out.print("Enter third number: ");
		z = input.nextInt();

		result = (x * y * z);

		System.out.printf("O produto e: %d\n ", result);

		input.close(); // close scanner;

	} // fim do metodo main

}// fim da classe Product
