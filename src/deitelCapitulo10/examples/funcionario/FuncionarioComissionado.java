package deitelCapitulo10.examples.funcionario;

import deitelCapitulo10.examples.date.Date;

public class FuncionarioComissionado extends Funcionario 
{
	private double quantidadeVendasSemanal;
	private double porcentagemVendas = 0;

	public FuncionarioComissionado(String primeiroNome, String segundoNome, String numeroDoSeguroSocial,
			double quantidadeVendasSemanal, double porcentagemVendas, Date dateBirth) 
	{
		super(primeiroNome, segundoNome, numeroDoSeguroSocial, dateBirth);

		if (quantidadeVendasSemanal < 0.0)
			throw new IllegalArgumentException("Quantidade de vendas não pode ser negativa ou tem que ser 0.");

		this.quantidadeVendasSemanal = quantidadeVendasSemanal;

		if (porcentagemVendas <= 0.0)
			throw new IllegalArgumentException("Porcentagem de vendas não pode ser negativa.");

		this.porcentagemVendas = porcentagemVendas;
	}

	public FuncionarioComissionado() {}
	
	public double getQuantidadeVendasSemanal()
	{
		return quantidadeVendasSemanal;
	}

	public void setQuantidadeVendasSemanal(double quantidadeVendasSemanal)
	{
		if (quantidadeVendasSemanal < 0.0)
			throw new IllegalArgumentException("Quantidade de vendas não pode ser negativa ou tem que ser 0.");
		
		this.quantidadeVendasSemanal = quantidadeVendasSemanal;
	}

	public double getPorcentagemVendas()
	{
		return porcentagemVendas;
	}

	public void setPorcentagemVendas(double porcentagemVendas)
	{
		if (porcentagemVendas <= 0.0)
			throw new IllegalArgumentException("Porcentagem de vendas não pode ser negativa.");
		
		this.porcentagemVendas = porcentagemVendas;
	}

	@Override
	public String toString() 
	{
		return String.format("%s%nQuantidade de vendas na semana: %.2f%nPorcentagem de Vendas: %.2f%n"
				, super.toString()
				, this.getQuantidadeVendasSemanal()
				, this.getPorcentagemVendas());
	}

	@Override
	public double getQuantiaPagavel() 
	{
		return this.getQuantidadeVendasSemanal() * this.getPorcentagemVendas();
	}
}
