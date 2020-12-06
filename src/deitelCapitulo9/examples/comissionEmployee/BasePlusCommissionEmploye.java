package deitelCapitulo9.examples.comissionEmployee;

public class BasePlusCommissionEmploye
{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double baseSalary;
	private double grossSales;
	private double commissionRate;
	
	public BasePlusCommissionEmploye(String firstName, String lastName, String socialSecurityNumber, double baseSalary,
			double grossSales, double commissionRate) 
	{
		if(baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be > 0.0");
		
		if(grossSales < 0.0)
			throw new IllegalArgumentException("Gross Sales must be > 0.0");
		
		if(commissionRate < 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission Rate must be > 0.0 or < 1.0 ");
				
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.baseSalary = baseSalary;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
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

	public void setBaseSalary(double baseSalary) 
	{
		if(baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be > 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary() 
	{
		return baseSalary;
	}

	public void setGrossSales(double grossSales) 
	{
		if(grossSales < 0.0)
			throw new IllegalArgumentException("Gross Sales must be > 0.0");
		
		this.grossSales = grossSales;
	}
	
	public double getGrossSales() 
	{
		return grossSales;
	}

	public void setCommissionRate(double commissionRate) 
	{
		if(commissionRate < 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission Rate must be > 0.0 or < 1.0");
		
		this.commissionRate = commissionRate;
	}
	
	public double getCommissionRate() 
	{
		return commissionRate;
	}
		
	public double earnings()
	{
		return baseSalary + (grossSales * commissionRate);
	}
	
	@Override
	public String toString() 
	{
		return String.format("%n%s%s %n%s%s %n%s%s %n%s%.2f %n%s%.2f %n%s%.2f"
				, "First Name: ",getFirstName()
				, "Last Name: ", getLastName()
				, "Social Security Number: ", getSocialSecurityNumber()
				, "Base Salary: ", getBaseSalary()
				, "Gross Sales: ", getGrossSales()
				, "Commission Rate: ", getCommissionRate());
	}
	
}
