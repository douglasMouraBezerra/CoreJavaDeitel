package deitelCapitulo14.exercises;

import java.util.Scanner;

//Exercicio 14.4 - Livro: Java Como Programar.
public class CompareStringPartes 
{
	public static void main(String[] args) 
	{
		System.out.println("COMPARANDO PARTES DE UMA STRING:::");
		try(Scanner scanner = new Scanner(System.in))
		{
				System.out.println("Digite a primeira frase:");
				String s1 = scanner.nextLine();
				
				System.out.println("Digite a segunda frase:");
				String s2 = scanner.nextLine();
				
				System.out.println("Informe quantos caracteres quer comparar:");
				int qtdChar = scanner.nextInt();
				
				System.out.println("Informe o indice ao que quer começar a comparacao::");
				int indice = scanner.nextInt();
				
				//true serve para ignorar maiusculas e minusculas na comparacao
				boolean resultado = s1.regionMatches(true, indice, s2, indice, qtdChar);
				
				if(resultado)
					System.out.println("Partes iguais nas strings s1 e s2");
				else
					System.out.println("Partes diferentes");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
