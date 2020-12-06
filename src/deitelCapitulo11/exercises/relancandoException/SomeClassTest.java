package deitelCapitulo11.exercises.relancandoException;

public class SomeClassTest
{
	public static void main(String[] args) 
	{
		try
		{
			SomeClass.someMethod();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
