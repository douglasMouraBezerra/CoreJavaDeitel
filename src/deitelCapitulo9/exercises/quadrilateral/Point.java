package deitelCapitulo9.exercises.quadrilateral;

public class Point {
	
	private double a;
	private double b;
	private double c;
	private double d;
	
	public Point(double a, double b, double c, double d) 
	{	
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public Point(double altura, double largura)
	{
		this(altura,largura,0.0,0.0);
	}
	
	public Point() {}

	public double getA() 
	{
		return a;
	}

	public void setA(double a) 
	{
		this.a = a;
	}

	public double getB() 
	{
		return b;
	}

	public void setB(double b) 
	{
		this.b = b;
	}

	public double getC() 
	{
		return c;
	}

	public void setC(double c) 
	{
		this.c = c;
	}

	public double getD() 
	{
		return d;
	}

	public void setD(double d) 
	{
		this.d = d;
	}
}
