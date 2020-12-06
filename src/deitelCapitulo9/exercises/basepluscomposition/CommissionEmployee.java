package deitelCapitulo9.exercises.basepluscomposition;

public class CommissionEmployee 
{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double rate;
	private double grossSales; //week sales
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double rate,
			double grossSales)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	
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
		this.rate = rate;
	}

	public double getGrossSales() 
	{
		return grossSales;
	}

	public void setGrossSales(double grossSales) 
	{
		this.grossSales = grossSales;
	}
	
	public double earnings()
	{
		return this.rate * this.grossSales;
	}

	@Override
	public String toString() 
	{
		return "CommissionEmployee \n[firstName=" + firstName + ", \nlastName=" + lastName + ", \nsocialSecurityNumber="
				+ socialSecurityNumber + ", \nrate=" + rate + ", \ngrossSales=" + grossSales + "]";
	}
}
