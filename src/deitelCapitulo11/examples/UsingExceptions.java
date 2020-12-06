package deitelCapitulo11.examples;

public class UsingExceptions 
{
	public static void main(String[] args) 
	{
		try 
		{
			metodo1();	
		}
		catch (Exception exception) //captura excecao lanca em method1 
		{ 
		System.err.printf("%s%n%n", exception.getMessage());
		exception.printStackTrace();
		
		//Obtem info rastreamento de pilha
		StackTraceElement [] traceElements = exception.getStackTrace();
		
		System.out.printf("%nStack Trace from getStackTrace:%n ");
		System.out.println("Class\t\tFile\t\t\tLine\tMethod");
		
		for (StackTraceElement stackTraceElement : traceElements) 
		{
			System.out.printf("%s\t", stackTraceElement.getClassName());
			System.out.printf("%s\t", stackTraceElement.getFileName());
			System.out.printf("%s\t", stackTraceElement.getLineNumber());
			System.out.printf("%s%n", stackTraceElement.getMethodName());
		}
	  }
	}

	//chama metodo2 e lanca a execao de volta para o main
	public static void metodo1() throws Exception
	{
		metodo2();
	}
	
	//chama metodo 3 a lanca execao para o metodo 1 
	public static void metodo2() throws Exception
	{
		metodo3();
	}
	
	//lanca execao para o metodo 2
	public static void metodo3() throws Exception 
	{
		throw new Exception("Excecao lancada no metodo 3");
	}
}
