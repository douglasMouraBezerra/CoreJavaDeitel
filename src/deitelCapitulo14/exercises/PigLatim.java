package deitelCapitulo14.exercises;

import java.util.Scanner;

//exercicio 14.7: Recebendo uma frase via teclado e a colocando em Latim de Porco.
public class PigLatim 
{
	public static void printLatimWord(String token) 
	{
		StringBuilder builder = new StringBuilder(token);
		builder.append(builder.charAt(0));
		builder.delete(0, 1);
		builder.append("ay");
		
		System.out.println(builder.toString());
	}

	public static void main(String[] args) 
	{
		System.out.println("INFORME UMA FRASE:");
		try (Scanner input = new Scanner(System.in)) 
		{

			String frase = input.nextLine();

			String[] tokens = frase.split(" ");

			for (int i = 0; i < tokens.length; i++)
				printLatimWord(tokens[i]);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
