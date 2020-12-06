package deitelCapitulo10.examples.funcionario;

import deitelCapitulo10.examples.date.Date;

public class FuncionarioPorHora extends Funcionario
{
	private double valorHoraTrabalhada;
	private int quantidadeHorasTrabalhadas;
	
	public FuncionarioPorHora(String primeiroNome, String segundoNome, String numeroDoSeguroSocial,
			double valorHoraTrabalhada, int quantidadeHorasTrabalhadas, Date dateBirth)
	{
		super(primeiroNome, segundoNome, numeroDoSeguroSocial,dateBirth);
		
		if(valorHoraTrabalhada <= 0.0)
			throw new IllegalArgumentException("Valor da Hora trabalhada deve ser maior que 0.");
		
		this.valorHoraTrabalhada = valorHoraTrabalhada;
		
		if(quantidadeHorasTrabalhadas <= 0 && quantidadeHorasTrabalhadas < 40)
			throw new IllegalArgumentException("Quantidade de horas trabalhadas devem ser maior que 0.");
		
		this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
	}

	public FuncionarioPorHora() {}
	
	public double getValorHoraTrabalhada() 
	{
		return valorHoraTrabalhada;
	}
 
	public void setValorHoraTrabalhada(double valorHoraTrabalhada)
	{
		if(valorHoraTrabalhada <= 0.0)
			throw new IllegalArgumentException("Valor da Hora trabalhada deve ser maior que 0.");
		
		this.valorHoraTrabalhada = valorHoraTrabalhada;
	}

	public int getQuantidadeHorasTrabalhadas()
	{
		return quantidadeHorasTrabalhadas;
	}

	public void setQuantidadeHorasTrabalhadas(int quantidadeHorasTrabalhadas)
	{
		if(quantidadeHorasTrabalhadas <= 0 && quantidadeHorasTrabalhadas < 40)
			throw new IllegalArgumentException("Quantidade de horas trabalhadas devem ser maior que 0.");
		
		this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
	}

	
	@Override
	public String toString() 
	{
		return String.format("%s%nValor Hora: %.2f%nQuantidade de Horas Trabalhadas: %d%n"
				, super.toString()
				, this.getValorHoraTrabalhada()
				, this.getQuantidadeHorasTrabalhadas());
	}

	@Override
	public double getQuantiaPagavel() 
	{		
		if(this.getQuantidadeHorasTrabalhadas() <= 40)
			return this.getQuantidadeHorasTrabalhadas() * this.getValorHoraTrabalhada();
		else
			return this.getValorHoraTrabalhada() * 40 + ((this.getQuantidadeHorasTrabalhadas() - 40) * this.getValorHoraTrabalhada() * 1.5); 
	}
}
