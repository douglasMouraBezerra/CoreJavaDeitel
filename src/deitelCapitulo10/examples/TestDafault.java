package deitelCapitulo10.examples;

public interface TestDafault 
{
	default void shows()
	{
		System.out.println("Teste dos recursos de interface do Java 8");
		System.out.println("Chamando metodo statico dois: " + dois());
	}
	
	static double dois()
	{
		return 2;
	}
	
}
