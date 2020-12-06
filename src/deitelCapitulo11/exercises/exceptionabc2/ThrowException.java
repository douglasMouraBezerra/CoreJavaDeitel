package deitelCapitulo11.exercises.exceptionabc2;

public class ThrowException 
{	
	public static void metodo1() throws Exception
	{
		try 
		{
			metodo2();
		}
		catch (Exception e) 
		{
			throw new Exception("Excecao lancada do metodo 1", e);
		}
	}

	public static void metodo2()
	{
		try 
		{
			metodo3();
		}
		catch (Exception e) 
		{
			throw new IllegalArgumentException("Excecao lancada do metodo 2, não verificada", e);
		}
	}
	
	public static void metodo3() throws ExceptionA
	{
		try
		{
			metodo4();
		}
		catch (Exception e) 
		{
			throw new ExceptionA("Mensagem lancada do metodo 3", e);
		}
	}
	
	public static void metodo4() throws Exception
	{
		try 
		{
			metodo5();
		}
		catch (Exception e) 
		{
			throw new ExceptionB("Excecao lancada do metodo 4", e);
		}
	}
	
	public static void metodo5() 
	{		
		throw new NullPointerException("excecao landacada do metodo 5");
	}
}