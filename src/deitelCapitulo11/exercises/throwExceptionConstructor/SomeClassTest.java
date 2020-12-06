package deitelCapitulo11.exercises.throwExceptionConstructor;


public class SomeClassTest 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{		
		try 
		{
			SomeClass someClass = new SomeClass("hvjhghhvjhghhvjhghhvjhghhvjhghhvjhghhvjhghhvjhghhvjhghhvjhghhvjhghhvjhghhvjhghhvjhgh", 12345);
			System.out.println(someClass.getNome() + " " + someClass.getConta());
		}
		catch (Exception e)
		{
			StackTraceElement[] elements = e.getStackTrace();
			
			for (StackTraceElement stackTraceElement : elements) 
			{
				System.out.println(stackTraceElement.getClassName() 
						+ "\n" + stackTraceElement.getLineNumber()
						+ "\n" + stackTraceElement.getMethodName());
			}
			e.printStackTrace();
		}
	}
}
