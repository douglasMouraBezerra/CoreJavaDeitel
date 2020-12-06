package deitelCapitulo9.exercises.quadrilateral;

/**
 * 
 * @author Douglas de Moura
 *
 */
public class Quadrilateral 
{
	private Point point = new Point();
	
	public Quadrilateral(double a, double b, double c, double d)
	{
		if((a + b + c + d) != 360)
			throw new IllegalArgumentException("Nao e um quadrilatero");
		
		this.point.setA(a);
		this.point.setB(b);
		this.point.setC(c);
		this.point.setD(d);
	}
	
	public Quadrilateral(double altura, double largura)
	{
		this(altura,largura,0.0,0.0);
	}
	
	public Quadrilateral() {}
	
	public double getA()
	{
		return this.point.getA();
	}
	
	public double getB()
	{
		return this.point.getB();
	}
	
	public double getC()
	{
		return this.point.getC();
	}
	
	public double getD()
	{
		return this.point.getD();
	}
	
	public double perimetro() 
	{
		return (this.getA() + this.getB() + this.getC() + this.getD());
	}
}