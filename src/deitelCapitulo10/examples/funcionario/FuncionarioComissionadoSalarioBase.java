package deitelCapitulo10.examples.funcionario;

import deitelCapitulo10.examples.date.Date;

public class FuncionarioComissionadoSalarioBase extends FuncionarioComissionado
{
	private double salarioBaseSemanal;
	
	public FuncionarioComissionadoSalarioBase(String primeiroNome, String segundoNome, String numeroDoSeguroSocial,
			double quantidadeVendasSemanal, double porcentagemVendas, double salarioBaseSemanal, Date dateBirth)
	{
		super(primeiroNome, segundoNome, numeroDoSeguroSocial, quantidadeVendasSemanal, porcentagemVendas, dateBirth);
		
		if(salarioBaseSemanal < 0.0)
			throw new IllegalArgumentException("Salario nao pode ser negativo");
		
		this.salarioBaseSemanal = salarioBaseSemanal;
	}

	public FuncionarioComissionadoSalarioBase() {}
	
	/**
	 * Metodo retorna o salario base acrescido de dez porcento.
	 * 
	 * @return {@link Double}
	 */
	public double getSalarioBaseSemanal() 
	{
		return (this.salarioBaseSemanal + (this.salarioBaseSemanal * 10) / 100);
	}

	public double getSalarioBaseSemenal2()
	{
		return this.salarioBaseSemanal;
	}
	
	public void setSalarioBaseSemanal(double salarioBaseSemanal) 
	{
		this.salarioBaseSemanal = salarioBaseSemanal;
	}
	
	@Override
	public double getQuantiaPagavel()
	{
		return super.getQuantiaPagavel() + this.getSalarioBaseSemanal();
	}

	@Override
	public String toString()
	{
		return String.format("%s%nSalario base semanal: %.2f%n"
				, super.toString()
				, this.getSalarioBaseSemanal());
	}
}
