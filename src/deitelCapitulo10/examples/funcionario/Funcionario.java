package deitelCapitulo10.examples.funcionario;

import deitelCapitulo10.examples.date.Date;

public abstract class Funcionario implements Pagavel
{
	private String primeiroNome;
	private String segundoNome;
	private String numeroDoSeguroSocial;
	private Date dateBirth;
	private double bonificacaoAniversario= 0.0;
	
		
	public Funcionario(String primeiroNome, String segundoNome, String numeroDoSeguroSocial, Date dateBirth) 
	{
		if(primeiroNome.equalsIgnoreCase("") && primeiroNome.length() > 250)
			throw new IllegalArgumentException("Nome não foi preenchido corretamente.");
		
		if(segundoNome.equalsIgnoreCase("") && segundoNome.length() > 250)
			throw new IllegalArgumentException("Sobrenome não foi preenchido corretamente.");
		
		if(numeroDoSeguroSocial.equalsIgnoreCase("") && numeroDoSeguroSocial.length() > 30)
			throw new IllegalArgumentException("Numero do Seguro Social não foi preenchido corretamente.");
		
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.numeroDoSeguroSocial = numeroDoSeguroSocial;
		this.dateBirth = dateBirth;
	}
	
	public Funcionario() {}

	public String getPrimeiroNome() 
	{
		return primeiroNome;
	}
	
	public double getBonificacaoAniversario() 
	{
		return bonificacaoAniversario;
	}
	
	public void setPrimeiroNome(String primeiroNome) 
	{
		if(primeiroNome.equalsIgnoreCase("") && primeiroNome.length() > 250)
			throw new IllegalArgumentException("Nome não foi preenchido corretamente.");
		
		this.primeiroNome = primeiroNome;
	}
	
	public String getSegundoNome() 
	{
		return segundoNome;
	}
	
	public void setSegundoNome(String segundoNome)
	{
		if(segundoNome.equalsIgnoreCase("") && segundoNome.length() > 250)
			throw new IllegalArgumentException("Sobrenome não foi preenchido corretamente.");
		
		this.segundoNome = segundoNome;
	}
	
	public String getNumeroDoSeguroSocial() 
	{ 
		return numeroDoSeguroSocial;
	}
	
	public void setNumeroDoSeguroSocial(String numeroDoSeguroSocial)
	{
		if(numeroDoSeguroSocial.equalsIgnoreCase("") && numeroDoSeguroSocial.length() > 30)
			throw new IllegalArgumentException("Numero do Seguro Social não foi preenchido corretamente.");
		
		this.numeroDoSeguroSocial = numeroDoSeguroSocial;
	}
	
	public Date getDateBirth() 
	{
		return dateBirth;
	}
	
	public void setDateBirth(Date dateBirth) 
	{
		this.dateBirth = dateBirth;
	}
		
	public double bonificacaoSalarioAniversario(Funcionario funcionario)
	{
		return this.bonificacaoAniversario += funcionario.getQuantiaPagavel() + 100.00;
	}
		
	@Override
	public String toString() 
	{
		return String.format("%s%nNome: %s%nSobrenome: %s%nNumero Seguro Social: %s%nGanhos: %.2f%nData de Nascimento: %s%nBonus aniversario: %.2f%n"
				, this.getClass().getSimpleName()
				, this.getPrimeiroNome()
				, this.getSegundoNome()
				,this.getNumeroDoSeguroSocial()
				,this.getQuantiaPagavel()
				,this.getDateBirth().toString()
				,this.getBonificacaoAniversario());
	}
}
