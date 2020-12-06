package deitelCapitulo10.examples.funcionario;

import deitelCapitulo10.examples.date.Date;

public class FuncionarioPorPecas extends Funcionario
{
	private double valorPorPeca;
	private int quantidadePecasSemanal;
		
	public FuncionarioPorPecas(String primeiroNome, String segundoNome, String numeroDoSeguroSocial, Date dateBirth,
			double valorPorPeca, int quantidadePecasSemanal) 
	{
		super(primeiroNome, segundoNome, numeroDoSeguroSocial, dateBirth);
	
		if(valorPorPeca <= 0.0)
			throw new IllegalArgumentException("Valor da peca nao pode ser negativo ou igual a zero.");
		
		if(quantidadePecasSemanal < 0.0)
			throw new IllegalArgumentException("Nao e possivel fazer uma quantidade negativa de pecas. Minimo 0.0");
		
		this.valorPorPeca = valorPorPeca;
		this.quantidadePecasSemanal = quantidadePecasSemanal;
	}

	public double getValorPorPeca() 
	{
		return valorPorPeca;
	}

	public void setValorPorPeca(double valorPorPeca) 
	{
		this.valorPorPeca = valorPorPeca;
	}

	public int getQuantidadePecasSemanal() 
	{
		return quantidadePecasSemanal;
	}

	public void setQuantidadePecasSemanal(int quantidadePecasSemanal) 
	{
		this.quantidadePecasSemanal = quantidadePecasSemanal;
	}

	@Override
	public double getQuantiaPagavel() {
		return this.getQuantidadePecasSemanal() * this.getValorPorPeca();
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + String.format("Quantidade de pecas na semana: %d%nValor por peca: %.2f%n"
				, this.getQuantidadePecasSemanal()
				, this.getValorPorPeca());
	}
}
