package deitelCapitulo14.exercises;

import java.util.Scanner;

//Exercicio 14.3 - Livro: Java Como Programar.
public class CompareString 
{
	public static void main(String[] args) 
	{
		System.out.println("PROGRAMA DE COMPARACAO DE STRINGS:::");
		
		try(Scanner scanner = new Scanner(System.in)) 
		{
			System.out.println("Informe a primeira frase:");
			String s1 = scanner.nextLine();
			
			System.out.println("Informe a segunda frase:");
			String s2 = scanner.nextLine();
			
			int result = s1.compareTo(s2);
			
			System.out.printf("Resultado: %d%n", result);
			
			if(result < 0)
				System.out.println("A segunda frase e maior que a primeira.");
			else if(result > 0)
				System.out.println("A primeira frase e maior que a segunda frase");
			else
				System.out.println("As frases tem  mesmo tamanho ");
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
