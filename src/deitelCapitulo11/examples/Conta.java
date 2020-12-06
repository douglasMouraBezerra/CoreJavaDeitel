package deitelCapitulo11.examples;

import java.util.InputMismatchException;

public abstract class Conta 
{
	private Double saldo;
	
	public Double getSaldo() 
	{
		return saldo;
	}
	
	public void setSaldo(Double saldo) 
	{
		this.saldo = saldo;
	}
	
	public void depositar(Double saldo) throws IllegalArgumentException, InputMismatchException
	{
		try 
		{
			if(saldo <= 0.0)
			{
				throw new IllegalArgumentException("Valor invalido");
			}
			
			if(!(saldo instanceof Double) || saldo.equals(null))
			{
				throw new InputMismatchException("Entrada invalida, apenas numeros.");
			}
		}
		catch (IllegalArgumentException | InputMismatchException e) 
		{
			System.err.println(e.getMessage());
		}
	}
}
