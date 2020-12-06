package deitelCapitulo11.exercises.exceptionabc;

public class ExceptionA extends Exception
{
	private static final long serialVersionUID = 1L;
	private String message;
	
	public ExceptionA(String message) 
	{
		super(message);
	}
	
	public ExceptionA(String message, Throwable throwable)
	{
		super(message, throwable);
	}
	
	public String getMessage() {
		return message;
	}
	
	
}
