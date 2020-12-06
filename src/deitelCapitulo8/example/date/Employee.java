package deitelCapitulo8.example.date;

public class Employee 
{
	private String firstName;
	private String lastName;
	
	private Date birthDate;
	private Date hireDate;
	
	public Employee(String firstName, String lastName, Date birthDate, Date hireDate) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.hireDate = hireDate;		
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public Date getBirthDate() 
	{
		return birthDate;
	}

	public Date getHireDate() 
	{
		return hireDate;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s %s BirthDay: %s Hired: %s%n", firstName,lastName,hireDate,birthDate);
	}
}
