package deitelCapitulo11.exercises.throwExceptionConstructor;

import java.util.InputMismatchException;

/**
 * Classe criada com intuito de mostrar o lancamento de excecao a partir de construtores, impedindo que objetos sejam criados
 * com informacoes inconsistentes
 * 
 * @author DOUGLAS
 *
 */
public class SomeClass 
{
	private String nome;
	private Integer conta;
	
	//LANCANDO EXECECOES NAO VERIFICADAS
	public SomeClass (String nome, Integer conta)
	{
		if(nome.length() > 50)
		{
			throw new IllegalArgumentException("Nome muito grande");
		}
		
		if(!(conta instanceof Integer))
		{
			throw new InputMismatchException("Tipo de objeto diferente do esperado");
		}
		
		this.nome = nome;
		this.conta = conta;				
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public Integer getConta() 
	{
		return conta;
	}
}
