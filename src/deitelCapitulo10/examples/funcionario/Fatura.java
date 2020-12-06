package deitelCapitulo10.examples.funcionario;

public class Fatura implements Pagavel 
{
	private final String numeroPeca;
	private final String descricaoPeca;
	private int quantidadePeca;
	private double precoPorItem;

	public Fatura(String numeroPeca, String descricaoPeca, int quantidadePeca, double precoPorItem)
	{
		if (quantidadePeca <= 0)
			throw new IllegalArgumentException("Quantida de pecas deve ser maior que zero.");

		if (precoPorItem <= 0.0)
			throw new IllegalArgumentException("Preco deve ser maior que zero.");

		this.numeroPeca = numeroPeca;
		this.descricaoPeca = descricaoPeca;
		this.quantidadePeca = quantidadePeca;
		this.precoPorItem = precoPorItem;
	}
	
	public Fatura() 
	{
		this("","",0,0.0);
	}

	public int getQuantidadePeca() 
	{
		return quantidadePeca;
	}

	public void setQuantidadePeca(int quantidadePeca) 
	{
		if (quantidadePeca <= 0)
			throw new IllegalArgumentException("Quantida de pecas deve ser maior que zero.");
		
		this.quantidadePeca = quantidadePeca;
	}

	public double getPrecoPorItem() 
	{
		return precoPorItem;
	}

	public void setPrecoPorItem(double precoPorItem) 
	{
		if (precoPorItem <= 0.0)
			throw new IllegalArgumentException("Preco deve ser maior que zero.");
		
		this.precoPorItem = precoPorItem;
	}

	public String getNumeroPeca() 
	{
		return numeroPeca;
	}

	public String getDescricaoPeca() 
	{
		return descricaoPeca;
	}
	
	@Override
	public String toString() 
	{
		return String.format("%s%nNumero da Peca: %s%nDescricao da peca: %s%nQuantidade de Pecas: %d%nPreco por Item: %.2f%n%n"
				, this.getClass().getSimpleName()
				, this.getNumeroPeca()
				, this.getDescricaoPeca()
				, this.getQuantidadePeca()
				, this.getQuantiaPagavel());		
	}

	@Override
	public double getQuantiaPagavel()
	{
		return this.getQuantidadePeca() * this.getPrecoPorItem(); //calculo do faturamento
	}
}
