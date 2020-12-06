package deitelCapitulo10.examples.funcionario;

import deitelCapitulo10.examples.date.Date;

public class FuncionarioAssalariado extends Funcionario 
{
	private double salarioFixoSemanal;
	
	public FuncionarioAssalariado(String primeiroNome, String segundoNome, String numeroDoSeguroSocial,
			double salarioFixoSemanal, Date dateBirth) 
	{
		super(primeiroNome, segundoNome, numeroDoSeguroSocial, dateBirth);
		
		if(salarioFixoSemanal <= 0.0)
			throw new IllegalArgumentException("Salario deve ser maior que zero.");
		
		this.salarioFixoSemanal = salarioFixoSemanal;
	} 

	public FuncionarioAssalariado() {}
	
	public double getSalarioFixoSemanal() 
	{
		return salarioFixoSemanal;
	}

	public void setSalarioFixoSemanal(double salarioFixoSemanal) 
	{
		if(salarioFixoSemanal <= 0.0)
			throw new IllegalArgumentException("Salario deve ser maior que zero.");
				
		this.salarioFixoSemanal = salarioFixoSemanal;
	}


	@Override
	public String toString() 
	{
		return String.format("%s%nSalario Semanal: %.2f%n"
				, super.toString()
				, this.getSalarioFixoSemanal());
	}

	@Override
	public double getQuantiaPagavel() 
	{
		return this.getSalarioFixoSemanal();
	}
}
