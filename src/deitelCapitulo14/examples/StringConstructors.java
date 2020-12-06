package deitelCapitulo14.examples;

/**
 * Classe que demonstra o uso dos construres de String.
 * 
 * @author Deitel
 *
 */
//Figura 14.1: StringConstructors.java
// construtores da classe String.
public class StringConstructors 
{
	public static void main(String[] args) 
	{
		char [] charArray = {'b','i','r','t','h', ' ' ,'d','a','y'};
		
		String s = new String("hello");
		
		String s1 = new String();
		String s2 = new String(s);
		
		String s3 = new String(charArray);
		String s4 = new String(charArray, 6, 3);
		
		System.out.printf(" s1 = %s%n s2 = %s%n s3 = %s%n s4 = %s%n", s1, s2, s3, s4);
		
	}
}
