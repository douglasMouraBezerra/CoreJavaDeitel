package deitelCapitulo9.examples.comissionEmployee;

public class CommissionEmployee extends Object
{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	private double grossSales;
	private double comissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double comissionRate) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		setGrossSales(grossSales);
		setComissionRate(comissionRate);
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public String getSocialSecurityNumber() 
	{
		return socialSecurityNumber;
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	
	public void setGrossSales(double grossSales) {
		if(grossSales < 0.0)
			throw new IllegalArgumentException("Must be >= 0.0");
		
		this.grossSales = grossSales;
	}
	
	public double getComissionRate() 
	{
		return comissionRate;
	}
	
	public void setComissionRate(double comissionRate) 
	{
		if(comissionRate <= 0.0 || comissionRate >= 1.0)
			throw new IllegalArgumentException("Must be >= 0.0 or < 1.0");
		
		this.comissionRate = comissionRate;
	}
	
	//calcula lucros
	public double earnings()
	{
		return comissionRate * grossSales;
	}

	@Override
	public String toString() 
	{
		return String.format("%n%s%s %n%s%s %n%s%s %n%s%.2f %n%s%.2f"
				,"First Name: ", this.firstName
				, "Last Name: ", this.lastName
				, "Social Security Number: ", this.socialSecurityNumber
				, "GrossSales: ", this.grossSales
				, "Commission Rate: ", this.comissionRate);
	}		
}
