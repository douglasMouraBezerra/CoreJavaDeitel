package deitelCapitulo10.exercises.carbonfootprint;

public class Bicycle implements CarbonFootprint
{
	private double kilometers;
	
	public Bicycle(double km)
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
		return this.getKilometers() * 5;
	}
}
