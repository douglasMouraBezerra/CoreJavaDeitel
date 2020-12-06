package deitelCapitulo9.exercises.employee;

public class CommissionEmployee extends Employee
{
	private double rate;
	private double grossSales; //week sales
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double rate,
			double grossSales)
	{
		
		super(firstName,lastName,socialSecurityNumber);
		
		if(rate <= 0.0)
			throw new IllegalArgumentException("Must be > 0.0");
		
		this.rate = rate;
		
		if(grossSales < 0)
			throw new IllegalArgumentException("Must be > 0.0");
		
		this.grossSales = grossSales;
	}

	public double getRate() 
	{
		return rate;
	}

	public void setRate(double rate) 
	{
		if(rate <= 0.0)
			throw new IllegalArgumentException("Must be > 0.0");
				
		this.rate = rate;
	}

	public double getGrossSales() 
	{
		return grossSales;
	}

	public void setGrossSales(double grossSales) 
	{
		if(grossSales < 0)
			throw new IllegalArgumentException("Must be > 0.0");
		
		this.grossSales = grossSales;
	}
	
	public double earnings()
	{
		return this.rate * this.grossSales;
	}

	@Override
	public String toString() 
	{
		return super.toString() +
				"\nRate: " + getRate() +
				"\nGrossSales: " + getGrossSales();
	}
	
}
