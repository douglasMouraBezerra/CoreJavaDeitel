package deitelCapitulo8.example;

public enum Book
{	
	JHTP("JAVA HOW TO POGRAMM","2014")
	,CHTP("C HOW TO PROGRAM","2016")
	,IW3HTP("Internet & World Wide Web How to Program", "2012")
	,CPPHTP("C++ How to Program", "2014")
	,VBHTP("Visual Basic How to Program", "2014")
	,CSHARPHTP("Visual C# How to Program", "2014");
	
	private String title;
	private String year;
	
	Book(String title, String year)
	{
		this.title = title;
		this.year = year;
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public String getYear() 
	{
		return year;
	}	
}
