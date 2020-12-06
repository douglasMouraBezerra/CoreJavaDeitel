package deitelCapitulo14.examples;

//Métodos StringBuilder charAt, setCharAt, getChars e reverse
public class StringBuilderChars 
{
	public static void main(String[] args) 
	{
		StringBuilder buffer = new StringBuilder("hello there");

		// show buffer
		System.out.printf("buffer = %s%n", buffer.toString());

		// mostrando chars em do StringBuilder em posicao especifica
		System.out.printf("Character at 0 = %s%nCharacter at 4 = %s%n", buffer.charAt(0), buffer.charAt(4));

		// demonstrando o uso de getChars no StringBuilder
		char[] charArray = new char[buffer.length()];

		buffer.getChars(0, buffer.length(), charArray, 0);

		System.out.print("The characteres are:::");

		for (char c : charArray)
			System.out.print(c);

		// trocando as letras em posicoes especificas no conteúdo do StringBuilder
		buffer.setCharAt(0, 'H');
		buffer.setCharAt(6, 'T');
		System.out.printf("%n%nbuffer = %s", buffer.toString());

		buffer.reverse();
		System.out.println("\nBuffer Reverse = " + buffer.toString());
		
	}
}
