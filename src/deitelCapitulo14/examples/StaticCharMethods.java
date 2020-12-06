package deitelCapitulo14.examples;

import java.util.Scanner;

public class StaticCharMethods 
{
	public static void main(String[] args) 
	{
		// scanner para leitura de valores.
		Scanner s = new Scanner(System.in);

		try 
		{
			// solicitando informação.
			System.out.print("Informe uma palavra qualquer>>>");

			// variavel input recebe a entrada de valores do teclado.
			String input = s.next();

			// obtendo o charater de entrada
			char c = input.charAt(0);

			// exibindo informações do primeiro character.
			// exibe informações de caractere
			System.out.printf("is defined: %b%n", Character.isDefined(c));
			System.out.printf("is digit: %b%n", Character.isDigit(c));
			System.out.printf("is first character in a Java identifier: %b%n", Character.isJavaIdentifierStart(c));
			System.out.printf("is part of a Java identifier: %b%n", Character.isJavaIdentifierPart(c));
			System.out.printf("is letter: %b%n", Character.isLetter(c));
			System.out.printf("is letter or digit: %b%n", Character.isLetterOrDigit(c));
			System.out.printf("is lower case: %b%n", Character.isLowerCase(c));
			System.out.printf("is upper case: %b%n", Character.isUpperCase(c));
			System.out.printf("to upper case: %s%n", Character.toUpperCase(c));
			System.out.printf("to lower case: %s%n", Character.toLowerCase(c));
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			s.close();
		}
	}
}
