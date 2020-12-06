package deitelCapitulo14.examples;

public class StringMiscellaneous 
{
	public static void main(String[] args) 
	{
		String s1 = "hello there";
		char [] charArray = new char[5];
		
		System.out.printf("S1: %s%n", s1);
		
		//tamanho da string
		System.out.printf("Length of S1: %d%n", s1.length());
		
		System.out.printf("The string reversed is: ");
		//revertendo a String
		for (int i = s1.length() - 1; i >= 0; i--) 
		{
			System.out.printf(" %c", s1.charAt(i));
		}
		
		//copiando caracteres a partir de uma String em um array de chars
		s1.getChars(0, 5, charArray, 0);
		
		System.out.printf("%nThe character array is: ");
		for (char c : charArray)
		{
			System.out.printf("%c",c);
		}
	}	
}
