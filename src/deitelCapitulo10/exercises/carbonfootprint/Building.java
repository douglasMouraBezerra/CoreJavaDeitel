package deitelCapitulo10.exercises.carbonfootprint;

public class Building implements CarbonFootprint
{
	private int qtdPersons;
	private double consumoEnergioEmKilowats;

	public Building(int qtdP, double ceek) 
	{
		if (qtdP <= 0.0)
			throw new IllegalArgumentException("Quantidade de pessoas nao pode ser negativa ou zero.");
		
		if(ceek < 0.0)
			throw new IllegalArgumentException("consumo de energia nao pode ser negativa.");
		
		this.qtdPersons = qtdP;
		this.consumoEnergioEmKilowats = ceek;
	}

	public int getQtdPersons() 
	{
		return qtdPersons;
	}

	public double getConsumoEnergioEmKilowats() 
	{
		return consumoEnergioEmKilowats;
	}

	@Override
	public double getCarbonFootprint() 
	{
		return (this.getQtdPersons() * this.getConsumoEnergioEmKilowats()  + 30.00 );
	}
}
