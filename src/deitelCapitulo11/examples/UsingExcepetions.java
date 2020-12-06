package deitelCapitulo11.examples;

/**
 * Classe tem a finalidade de demonstrar o uso do mecanismo de tratamento de
 * exceção try...catch...finally
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
			throw e;// lança novamente para processamento adicional
		}finally // executa independentemente do que ocorre em try...catch
		{ 
			System.err.println("Finally executed in throwException");
		}		
	}
	
	// demonstra finally quando nenhuma exceção ocorrer
	public static void doesNotThrowException()
	{
		try // bloco try não lança uma exceção
		{
			System.out.println("Method doesNotThrowException");
		}
		catch (Exception exception) // não executa
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
