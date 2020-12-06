package deitelCapitulo9.examples.comissionEmployee;

public class BasePlusCommissionEmployeeTest 
{
	public static void main(String[] args) 
	{
		BasePlusCommissionEmploye employe = new BasePlusCommissionEmploye("Martin", "Luther King", "333-33-3333", 2000, 10000, .06);
		
		System.out.println("Information obtained by get methods. . .");
		System.out.printf("%n%s%s ","First Name: ",employe.getFirstName());
		System.out.printf("%n%s%s ","Last Name: ",employe.getLastName());
		System.out.printf("%n%s%s ","Social Security Number: ",employe.getSocialSecurityNumber());
		System.out.printf("%n%s%.2f ","Base Salary: ",employe.getBaseSalary());
		System.out.printf("%n%s%.2f ","Gross Sale: ",employe.getGrossSales());
		System.out.printf("%n%s%.2f ","Commision Rate: ",employe.getCommissionRate());
		
		System.out.println("\n\nUpdated information obtained by toString. . .");
		
		employe.setBaseSalary(1500);
		
		System.out.printf("%n%s%n%n ",employe);
	}
}
