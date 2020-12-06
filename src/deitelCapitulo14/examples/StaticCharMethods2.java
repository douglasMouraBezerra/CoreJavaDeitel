package deitelCapitulo14.examples;

import java.util.Scanner;

public class StaticCharMethods2
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		try {
			// solicitando a base ou radical para fazer a conversao
			System.out.println("Digite a base:::");
			int radical = scanner.nextInt();

			System.out.printf("Por favor escolha um:%n1 -- %s%n2 -- %s%n", "Converter digito para caractere",
					"Converter caractere para digito");
			int escolha = scanner.nextInt();

			switch (escolha) 
			{
			case 1:// converte digito para caractere
				System.out.println("Entre com um digito:::");
				int digito = scanner.nextInt();
				System.out.printf("Convertendo digito em caractere : %s%n", Character.forDigit(digito, radical));
				break;

			case 2: // converte caractere para digito
				System.out.println("Entre com um caractere:");
				
				char c = scanner.next().charAt(0); // mesmo que o usuario digite mais de um char, pegamos so a primeira  posicao
													
				System.out.printf("Convertendo caractere para digito: %s%n", Character.digit(c, radical));

				break;

			default:
				break;
			}
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
