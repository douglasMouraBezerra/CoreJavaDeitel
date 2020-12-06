package deitelCapitulo11.exercises.exceptionabc3;

/**
 * Classe criada para demonstrar a importancia da ordenacão dos blocos catch, 
 * e que devemos colocar a excecao de superclasse por ultimo.
 * 
 * @author Douglas
 *
 */
public class LearnException 
{
	public static void showText(String texto)
	{
		if(!(texto instanceof String))
		{
			throw new IllegalArgumentException("Argumento invalido");
		}
		
		System.out.printf("%s%n", texto);
	}
	
	public static void divideByZero(int numerador, int denominador)
	{
		if(denominador == 0)
		{
			throw new ArithmeticException("Denominador deve ser maior que zero.");
		}
		
		double resultadoDivisao = numerador / denominador;
		
		System.out.printf("%.2f%n", resultadoDivisao);
	}
	
	public static void main(String[] args) 
	{  //aqui, quando a excecao ocorre, ela pega a primeira correspondencia.
		try 
		{
			LearnException.divideByZero(2, 0);			
		}
		
		catch (IllegalArgumentException e) 
		{
			e.printStackTrace();
		}
		
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		catch (Exception e) // inverter a ordem causa erro de compilacao
		{
			e.printStackTrace();
		}
		
		//===============================
		
		try 
		{
			LearnException.showText(null);
			
		}
		
		catch (IllegalArgumentException e) 
		{
			e.printStackTrace();
		}
		
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		catch (Exception e) // inverter a ordem causa erro de compilacao
		{
			e.printStackTrace();
		}
	}
}
































