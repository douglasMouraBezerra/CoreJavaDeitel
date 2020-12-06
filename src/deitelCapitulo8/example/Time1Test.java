package deitelCapitulo8.example;

public class Time1Test 
{
	public static void main(String[] args) 
	{
		Time1 t = new Time1();
		
		//mostrando valores padroes
		displayTime("After time object is created", t);
		System.out.println();
			
		
		t.setTime(16, 30, 40);
		displayTime("After calling setTime", t);
		System.out.println();
		
		//tentado def hora com valores fora do padrão.
		try {
			
		t.setTime(99, 99, 99);
		
			
		} catch (Exception e) {
			System.out.printf("%s%n%n", e.getMessage());
		}
		
		
		
	}
	
	private static void displayTime(String header, Time1 t) 
	{
		System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n"
				,header, t.toUniversalString(), t.toString());
	}
}
