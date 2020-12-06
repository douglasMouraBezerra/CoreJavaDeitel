package deitelCapitulo11.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling 
{	
	public static int quotiente(int numerator, int denominator)
	{
		return numerator / denominator;
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true;
		
		do 
		{
			try 
			{
				System.out.println("INFORME UM NUMERADOR: ");
				int numerator = scanner.nextInt();
				
				System.out.println("INFORME UM DENOMINADOR: ");
				int denominator = scanner.nextInt();
				
				System.out.println("O resultado da divisao e: " + DivideByZeroNoExceptionHandling.quotiente(numerator, denominator));
				
				continueLoop = false;
				
				scanner.close();
			} 
			catch (InputMismatchException e) 
			{
				System.err.printf("%nException: %s", e);
				
				scanner.nextLine(); // descarta a entrada do usuario para que possa tentar denovo
				
				System.out.println("Voce deve inserir inteiros !!!");
				
			} 
			catch (ArithmeticException e) 
			{
				System.err.printf("%nException: %s", e);
				
				scanner.nextLine(); // descarta a entrada do usuario para que possa tentar denovo
				
				System.out.println("Zero é um numero invalido. Tente novamente . . . ");
			}
			
		}while(continueLoop);				
	}
}
