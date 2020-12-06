package deitelCapitulo14.examples;

public class StringBuilderConstructors 
{
	public static void main(String[] args) 
	{
		StringBuilder buffer1 = new StringBuilder(); // tam padrao de 16 caracteres
		StringBuilder buffer2 = new StringBuilder(10); // tam de dez
		StringBuilder buffer3 = new StringBuilder("Hello Word");
		//a mais um construtor que aceita um charSequence...
		
		System.out.printf("buffer1 = \"%s\"%nbuffer2 = \"%s\"%nbuffer3 = \"%s\"%n"
				,buffer1
				,buffer2
				,buffer3);		
	}
}
