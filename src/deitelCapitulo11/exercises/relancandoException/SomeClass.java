package deitelCapitulo11.exercises.relancandoException;

/**
 * Classe criada para demonstrar o relancamento de execoes e encapsulamento das informacoes
 * 
 * @author Douglas
 *
 */
public class SomeClass 
{	
	public static void someMethod()
	{
		try 
		{
			someMethod2();
		}
		catch (Exception e) 
		{
			throw new IllegalArgumentException("Execao lancada de someMethod", e);
		}
	}
	
	public static void someMethod2()
	{
		throw new NullPointerException("Excecao lancada de someMethod 2");
	}		
}
