package deitelCapitulo11.exercises.exceptionabc2;

public class ThrowExceptionTest
{
	public static void main(String[] args) 
	{
		try 
		{
			ThrowException.metodo1();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
