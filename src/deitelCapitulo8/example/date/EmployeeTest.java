package deitelCapitulo8.example.date;

public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		Date dateB = new Date(06, 14, 1991);
		Date dateH = new Date(06, 11, 2013);
		
		Employee employee = new Employee("Douglas", "de Moura",dateH,dateB);
		
		System.out.println(employee);
		
	}
}
