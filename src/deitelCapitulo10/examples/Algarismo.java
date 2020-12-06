package deitelCapitulo10.examples;

public abstract class Algarismo {
	
	public int soma(int...is)
	{
		int soma = 0;
		
		for (int i : is)
			soma+=i;
		
		return soma;
	}
	
	//pode não ter nenhum ou um ou mais 
	//	public abstract void getSubclasseName();
	
}
