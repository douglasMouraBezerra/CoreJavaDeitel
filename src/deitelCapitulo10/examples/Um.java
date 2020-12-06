package deitelCapitulo10.examples;

public class Um extends Algarismo 
{
	public static void main(String[] args) 
	{
		//não e possivel fazer essa atribuicao sem downcasting
		//		Algarismo algarismo =  new Algarismo();
		//		Um um = (Um) algarismo;
		
		Algarismo algarismo = new Um();
		System.out.println(algarismo.soma(1,2,3,4,5,6,7,8,9,10));
	}

	
}
