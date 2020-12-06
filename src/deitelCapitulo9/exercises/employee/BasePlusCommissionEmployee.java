package deitelCapitulo9.exercises.employee;

public class BasePlusCommissionEmployee extends CommissionEmployee
{
	
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double rate,
			double grossSales, double baseSalary) 
	{
		super(firstName, lastName, socialSecurityNumber, rate, grossSales);
		
		if(baseSalary <= 0.0)
			throw new IllegalArgumentException("Base Salary muste be > 0.0");
		
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() 
	{
		return baseSalary;
	}
	
	public void setBaseSalary(double baseSalary) 
	{
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earnings() 
	{
		return super.earnings() + this.getBaseSalary();
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + "\nBase Salary: " + this.getBaseSalary();
	}
	
}
