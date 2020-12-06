package deitelCapitulo9.exercises.basepluscomposition;

public class Test 
{
	public static void main(String[] args) 
	{
		CommissionEmployee commissionEmployee = new CommissionEmployee("Thiago", "Sales", "12345", 0.05, 200.00);
		System.out.println(commissionEmployee);
		System.out.println("Ganhos: " + commissionEmployee.earnings());
		
		System.out.println();
		
		//BasePlusCommissionEmployee
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Douglas", "Moura", "54321", 0.05, 500.00, 1000.00);
		System.out.println(basePlusCommissionEmployee);
		System.out.println("Ganhos: " + basePlusCommissionEmployee.earnings());
		
		
	}
}
