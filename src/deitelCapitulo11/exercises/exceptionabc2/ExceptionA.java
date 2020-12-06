package deitelCapitulo11.exercises.exceptionabc2;

/**
 * Pacote criado referente ao exercicio de capitulo 11 e questao 17
 *  
 * @author Douglas
 *
 */
public class ExceptionA extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public ExceptionA(String messageError) 
	{
		super(messageError);
	}
	
	public ExceptionA(String messageError, Throwable throwable) 
	{
		super(messageError, throwable);
	}
}
