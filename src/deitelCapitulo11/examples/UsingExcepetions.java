package deitelCapitulo11.examples;

/**
 * Classe tem a finalidade de demonstrar o uso do mecanismo de tratamento de
 * exce��o try...catch...finally
 * 
 * @author Deitel
 *
 */
public class UsingExcepetions 
{
	public static void main(String[] args) 
	{
		try 
		{
			throwException();
		}
		catch (Exception e) 
		{
			System.err.println("Excecao capturada no main");
		}
			doesNotThrowException();
	}
	
	public static void throwException() throws Exception
	{
		try 
		{
			System.out.println("Metodo ThrowException");
			throw new Exception(); //lanca excecao e a captura
		}
		catch (Exception e) 
		{
			System.err.println("Excecao capturada no metodo throwException");
			throw e;// lan�a novamente para processamento adicional
		}finally // executa independentemente do que ocorre em try...catch
		{ 
			System.err.println("Finally executed in throwException");
		}		
	}
	
	// demonstra finally quando nenhuma exce��o ocorrer
	public static void doesNotThrowException()
	{
		try // bloco try n�o lan�a uma exce��o
		{
			System.out.println("Method doesNotThrowException");
		}
		catch (Exception exception) // n�o executa
		{
			System.err.println(exception);
		}
		finally // executa independentemente do que ocorre em try...catch
		{ 
			System.err.println("Finally executed in doesNotThrowException"); 
		}
			System.out.println("End of method doesNotThrowException");
		}
	}
