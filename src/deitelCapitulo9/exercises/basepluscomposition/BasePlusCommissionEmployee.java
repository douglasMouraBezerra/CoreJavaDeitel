package deitelCapitulo9.exercises.basepluscomposition;

public class BasePlusCommissionEmployee 
{
	private double baseSalary;
	private CommissionEmployee commissionEmployee;
	
	public BasePlusCommissionEmployee(String f, String l, String s, double r, double g, double baseSalary)
	{
		this.commissionEmployee = new CommissionEmployee(f, l, s, r, g);
		
		if(baseSalary <= 0.0)
			throw new IllegalArgumentException("Base Salary must be > 0.0");
		
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary()
	{
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) 
	{
		if(baseSalary <= 0.0)
			throw new IllegalArgumentException("Base Salary must be > 0.0");
		
		this.baseSalary = baseSalary;
	}

	public CommissionEmployee getCommissionEmployee() 
	{
		return commissionEmployee;
	}

	public void setCommissionEmployee(CommissionEmployee commissionEmployee) 
	{
		this.commissionEmployee = commissionEmployee;
	}
	
	public double earnings()
	{
		return this.commissionEmployee.earnings() + this.baseSalary;
	}

	@Override
	public String toString() 
	{
		return "BasePlusCommissionEmployee \n[baseSalary=" + baseSalary + ", \ncommissionEmployee=" + commissionEmployee + "]"; //call tooString
	}
	
	
	
}
