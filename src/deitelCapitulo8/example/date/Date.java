package deitelCapitulo8.example.date;

public class Date 
{
	private int month, year, day;
	
	private static int[] dayPorMonths = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	
	public Date(int month, int day, int year) 
	{
		if(month <= 0 || month > 12)
			throw new IllegalArgumentException("month must be 1-12");
		
		if(day <= 0 || day > dayPorMonths[month] && !(month == 2 && day == 29))
			throw new IllegalArgumentException("day out-of-range for the especified month and year.");
		
		if(month == 2 || day == 29 && !(year % 400 == 0 || year % 4 == 0 && year % 400 != 0))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		
		this.month = month;
		this.day = day;
		this.year = year;
		
		System.out.printf("%s\n", this);
	}
	
	@Override
	public String toString() 
	{
		return String.format("%d / %d / %d", month,day,year);
	}

	
	
	
}
