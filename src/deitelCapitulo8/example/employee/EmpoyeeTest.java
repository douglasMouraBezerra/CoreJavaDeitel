package deitelCapitulo8.example.employee;

public class EmpoyeeTest 
{
	public static void main(String[] args) 
	{
		System.out.printf("Quantidade de objetos employee criados : %d%n", Employee.getCount());

		Employee employee1 = new Employee("Douglas", "Moura");
		Employee employee2 = new Employee("Genival", "Lacerda");

		System.out.println("Apos instanciacao . . .");
		System.out.printf("Quantidade de objetos employee criados : %d%n", Employee.getCount());
//		System.out.printf("via employee1: %d%n", employee1.getCount());
//		System.out.printf("via employee2: %d%n", employee2.getCount());

		System.out.printf("%nEmployess: : : %n");
		System.out.println(employee1.getFirstName() + " " + employee1.getLastName());
		System.out.println(employee2.getFirstName() + " " + employee2.getLastName());
	}
}
