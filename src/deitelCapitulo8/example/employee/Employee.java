package deitelCapitulo8.example.employee;

public class Employee 
{
	private static int count = 0;
	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		++count;
		
		System.out.printf("First Name: %s%nLast Name: %s%nEmployes created: %d%n"
				,this.firstName, this.lastName, count);
	}
	
	public static int getCount()
	{
		return count;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
}
