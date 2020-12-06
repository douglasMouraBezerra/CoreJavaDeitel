package deitelCapitulo3;

public class Employee {
	private String firstName;
	private String secondaName;
	private double salarioMensal;

	public Employee(String firstName, String secondaName, double salario) {
		this.firstName = firstName;
		this.secondaName = secondaName;
		if (salario > 0) {
			this.salarioMensal = salario;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondaName() {
		return secondaName;
	}

	public void setSecondaName(String secondaName) {
		this.secondaName = secondaName;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

}
