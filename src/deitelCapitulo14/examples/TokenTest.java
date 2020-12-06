package deitelCapitulo14.examples;

import java.util.Scanner;

public class TokenTest 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		try
		{
			System.out.println("Digite uma frase e pressione ENTER:");
			String frase = scanner.nextLine();
			
			String [] tokens = frase.split(" ");
			
			System.out.printf("Quantidade de tokens::: %d%n", tokens.length);
			
			System.out.println("Os tokens sao:::");
			for (String string : tokens)
				System.out.println(string);
			
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			scanner.close();
		}
	}
}
