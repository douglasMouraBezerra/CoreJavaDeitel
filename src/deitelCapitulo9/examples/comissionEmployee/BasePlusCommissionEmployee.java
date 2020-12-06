package deitelCapitulo9.examples.comissionEmployee;

public class BasePlusCommissionEmployee extends CommissionEmployee
{
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double comissionRate, double baseSalary) 
	{
		super(firstName, lastName, socialSecurityNumber, grossSales, comissionRate);
		
		this.baseSalary = baseSalary;
	}
	
	public void setBaseSalary(double baseSalary) 
	{
		if(baseSalary < 0.0)
			throw new IllegalArgumentException("Base Salary must be > 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary() 
	{
		return baseSalary;
	}
	
	@Override
	public double earnings() 
	{
		return baseSalary + super.earnings();
	}
	
	@Override
	public String toString() 
	{	
		return super.toString() + String.format("%n%s: %.2f"
				, "Base Salary", getBaseSalary());
	}
}
