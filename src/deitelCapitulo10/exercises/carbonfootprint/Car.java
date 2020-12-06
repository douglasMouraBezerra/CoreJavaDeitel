
package deitelCapitulo10.exercises.carbonfootprint;

public class Car implements CarbonFootprint 
{
	private double kilometers;
	
	public Car(double km) 
	{
		if(km <= 0.0)
			throw new IllegalArgumentException("Kilometragem nao pode ser negativa ou zero.");
		
		this.kilometers = km;		
	}

	public double getKilometers() 
	{
		return kilometers;
	}
	
	@Override
	public double getCarbonFootprint() 
	{
		return this.getKilometers() * 20;
	}
}