package deitelCapitulo11.examples.Assert;

import java.util.Scanner;

/**
 * Figura 11.8
 * @author Douglas
 *
 */
public class AssertTest 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 10 . . . : ");
		int number = scanner.nextInt();
		
		//checa se o valor e maior ou igual a 0 e menor ou igual a 10
		//se a condicao do assert nao for correspondida, a expressao 2, que e a mensagem bad number, e lancada ao prompt.
		assert (number >= 0 && number <= 10) : "bad number: " + number;		
		
		System.out.printf("You entered %d%n", number);
		
		scanner.close();
	}
}
