package deitelCapitulo11.exercises.exceptionabc2;

public class ExceptionB extends ExceptionA 
{
	private static final long serialVersionUID = 1L;

	public ExceptionB(String messageError) 
	{
		super(messageError);
	}

	public ExceptionB(String messageError, Throwable throwable) 
	{
		super(messageError, throwable);
	}
}
