package deitelCapitulo8.exercise;

/**
 * Classe Retangulo
 * @author Douglas de Moura
 *
 */
public class Capitulo8_Questao4 
{
	private double length;
	private double width;
	
	public Capitulo8_Questao4() 
	{
		length = 1;
		width = 1;
	}

	public double getLength() 
	{
		return length;
	}

	public void setLength(double length) 
	{
		if(length < 0.0 || length > 20.0)
			throw new IllegalArgumentException("Valor fora dos limites . . .");
		
		this.length = length;
	}

	public double getWidth() 
	{
		return width;
	}

	public void setWidth(double width) 
	{
		if(width < 0.0 || width > 20.0)
			throw new IllegalArgumentException("Valor fora dos limites . . .");
		
		this.width = width;
	}
			
	public double areaRetangulo()
	{
		return length * width;
	}
	
	public double perimetroRetangulo()
	{
		return 2 * (length + width);
	}
	
	public static void main(String[] args) 
	{
		//Testando a classe
		try {
		Capitulo8_Questao4 questao4 = new Capitulo8_Questao4();
		questao4.setLength(5);
		questao4.setWidth(20);
		
		System.out.printf("%nArea do retangulo: %.2f%nPerimetro do Retangulo: %.2f%n"
				,questao4.areaRetangulo()
				,questao4.perimetroRetangulo());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
