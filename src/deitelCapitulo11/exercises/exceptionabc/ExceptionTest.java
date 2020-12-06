package deitelCapitulo11.exercises.exceptionabc;

/**
 * Questao 16 do capitulo 11 do livro: Java Como Programar - volume 8 / 10
 *
 * @author Douglas
 *
 */
public class ExceptionTest 
{
	public static void metodo1() throws ExceptionB
	{
		throw new ExceptionB("Excecao lancada do metodo 1");
	}
	
	public static void metodo2() throws ExceptionC
	{
			throw new ExceptionC("Excecao lancada de metodo 2");
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			metodo1();
			metodo2();
		}
		catch (ExceptionA a) 
		{
//			StackTraceElement [] traceElements = a.getStackTrace();
//			
//			for (StackTraceElement stackTraceElement : traceElements) 
//			{
//				System.out.println(stackTraceElement.getClassName() 
//						+ "\n" + stackTraceElement.getMethodName()
//						+ "\n" + stackTraceElement.getLineNumber()
//						+ "\n" + stackTraceElement.getFileName());			
//			}
//			
//			System.out.println(a.getMessage());
			
			a.printStackTrace();
		}
	}
}
