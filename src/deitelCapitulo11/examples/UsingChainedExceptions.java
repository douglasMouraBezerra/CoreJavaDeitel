package deitelCapitulo11.examples;

/**
 * Classe com intuito de mostrar as exceçoes encadeadas.
 * 
 * @author Douglas de Moura
 *
 */
public class UsingChainedExceptions 
{
	public static void main(String[] args) 
	{
		try
		{
			metodo1();
		}
		catch (Exception e) 
		{
			
			e.printStackTrace();
	//			StackTraceElement[] traceElements = e.getStackTrace();
	//			for (StackTraceElement stackTraceElement : traceElements) 
	//			{
					//problema aqui é que ele nao encadeia as exececoes, melhor usar o printstacktrace
	//				System.err.println(stackTraceElement.getClassName()
	//									+ " / " + stackTraceElement.getFileName() 
	//									+ " / " + stackTraceElement.getMethodName()
	//									+ " / " + stackTraceElement.getLineNumber());
	//   	}
		}	
	}
	
	public static void metodo1() throws Exception
	{
		try 
		{
			metodo2();
		} catch (Exception e) 
		{
			throw new Exception("Excecao lancada do metodo 1", e);
		}
	}
	
	
	public static void metodo2() throws Exception
	{
		try 
		{
			metodo3();
		} catch (Exception e) 
		{
			throw new Exception("Excecao lancada no metodo2", e);
		}
	}
	
	
	public static void metodo3() throws Exception
	{
		throw new Exception("Excecao lancada no modo 3");
	}
}
