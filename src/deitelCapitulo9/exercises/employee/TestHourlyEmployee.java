package deitelCapitulo9.exercises.employee;

public class TestHourlyEmployee 
{
	public static void main(String[] args) 
	{
		HourlyEmployee employee = new HourlyEmployee("Douglas", "Moura", "123456789", 168, 50.00);
		System.out.println(employee);
		System.out.println(String.format("%n%s: %.2f", "Ganho Semanal", employee.earnings()));
	}
}
