package deitelCapitulo3.testes;

import deitelCapitulo3.Employee;

public class EmployeeTest {
	public static void main(String[] args) {

		Employee employee = new Employee("Douglas", "Moura", 2000);
		Employee employee2 = new Employee("Rodrigo", "Santos", 3000);

		System.out.printf("Salario anual de %s %s e de: %.2f\n", employee.getFirstName(), employee.getSecondaName(),
				(employee.getSalarioMensal() * 12));

		System.out.printf("Salario anual de %s %s e de: %.2f\n", employee2.getFirstName(), employee2.getSecondaName(),
				(employee2.getSalarioMensal() * 12));

		// aumento de 10%
		double employeeAumento = (((employee.getSalarioMensal() * 12) * 10) / 100);
		double employeeAumento2 = (((employee2.getSalarioMensal() * 12) * 10) / 100);

		System.out.println("\nSalario aumentado em 10%: ");
		System.out.printf("\nSalario anual de %s %s e de: %.2f", employee.getFirstName(), employee.getSecondaName(),
				employeeAumento + (employee.getSalarioMensal() * 12));

		System.out.printf("\nSalario anual de %s %s e de: %.2f", employee2.getFirstName(), employee2.getSecondaName(),
				employeeAumento2 + (employee2.getSalarioMensal() * 12));

	}
}
