package deitelCapitulo9.exercises.employee;

public class HourlyEmployee extends Employee 
{
	private double hour; // qtd horas trabalhadas
	private double wage; //salario por hora
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hour, double wage) 
	{
		super(firstName, lastName, socialSecurityNumber);
		
		//horas trabalhadas na semana
		if(hour < 0.0 || hour > 168)
			throw new IllegalArgumentException("Hour Must be > 0.0 and < 168");
		
		if(wage <= 0.0)
			throw new IllegalArgumentException("Wage Must be >= 0.0");
		
		this.hour = hour;
		this.wage = wage;
	}
	
	public double getHour() 
	{
		return hour;
	}
	
	public void setHour(double hour) 
	{
		this.hour = hour;
	}

	public double getWage() 
	{
		return wage;
	}
	
	public void setWage(double wage) 
	{
		this.wage = wage;
	}
	
	public double earnings()
	{
		return this.getHour() * this.getWage();
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+ "\nHour: " + this.getHour()
				+ "\nWage: " + this.getWage();
	}
}
