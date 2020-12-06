package deitelCapitulo14.examples;

import java.util.Arrays;

public class RegexSubstitution 
{
	public static void main(String[] args) 
	{
		String firstString = "This sentence ends in 5 stars *****";
		String secondString = "1, 2, 3, 4, 5, 6, 7, 8";
		
		System.out.printf("String original 1: %s%n", firstString);
		
		//substituindo * por ^ 
		firstString = firstString.replaceAll("\\*", "^");
		
		System.out.printf("Substituindo * por ^ na String 1: %s%n", firstString);
		
		//substituindo estrelas por circunflexo
		firstString = firstString.replaceAll("stars", "carets");
		
		System.out.printf("Substituindo 'estrelas' por 'circunflexos' na String 1: %s%n", firstString);
		
		//substituindo qualquer palavra por palavra
		System.out.printf("Substituindo qualquer palavra por 'word' na String 1: %s%n", firstString.replaceAll("\\w+", "word"));
		
		System.out.printf("Segunda String Original: %s%n", secondString);
		
		//substituindo os primeiros 3 digitos pela palavra digito.
		for (int i = 0; i < 3; i++)
			secondString = secondString.replaceFirst("\\d", "digito");
		
		System.out.printf("Primeiros três digitos substituidos pela palavra digito na segunda String: %s%n", secondString);
		
		System.out.print("String split at commas: ");
		String[] results = secondString.split(",\\s*"); // divide em vírgulas
		System.out.println(Arrays.toString(results));
		
		
	}
}
