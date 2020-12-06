package deitelCapitulo9.exercises.quadrilateral;

public class Square extends Quadrilateral {

	private double altura, largura;
	
	public Square(double altura, double largura) 
	{			
		super(altura,largura,0.0,0.0);
	}
	
	public Square() {}
	
	public double getArea()
	{
		return this.getAltura() * this.getLargura();
	}

	public double getAltura() 
	{
		return this.altura;
	}

	public double getLargura() 
	{
		return this.largura;
	}
	
	public void setAltura(double altura) 
	{
		this.altura = altura;
	}
	
	public void setLargura(double largura) 
	{
		this.largura = largura;
	}
	
	@Override
	public double perimetro() 
	{
		return (super.perimetro() * 2);
	}

}
