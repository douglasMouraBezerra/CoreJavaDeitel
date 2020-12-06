package deitelCapitulo9.examples.comissionEmployee;

public class ComissionEmployeeTest 
{
	public static void main(String[] args) 
	{
		//inst commision employee
		CommissionEmployee employee = new CommissionEmployee("Sara", "Connor", "222-22-2222", 10000, .06);
		
		System.out.println("Employee information obtained by get methods:::");
		
		System.out.printf("%n%s %s","First Name", employee.getFirstName());
		System.out.printf("%n%s %s","Last Name", employee.getLastName());
		System.out.printf("%n%s %s","Social Security Number", employee.getSocialSecurityNumber());
		System.out.printf("%n%s %.2f","Gross Sales", employee.getGrossSales());
		System.out.printf("%n%s %.2f","Commision Rate", employee.getComissionRate());
		
		employee.setGrossSales(5000);
		employee.setComissionRate(.1);
		
		System.out.printf("%n%s", employee);		
	}

}
