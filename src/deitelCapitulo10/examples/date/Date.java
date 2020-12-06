package deitelCapitulo10.examples.date;

public class Date 
{
	private int month; // 1-12
	private int day; // 1-31 conforme o mês
	private int year; // qualquer ano

	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// construtor: confirma o valor adequado para o mês e dia dado o ano
	public Date(int month, int day, int year) 
	{

		// verifica se mês está no intervalo
		if (month <= 0 || month > 12)
			throw new IllegalArgumentException("month (" + month + ") must be 1-12");

		// verifica se day está no intervalo para month
		if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

		// verifique no ano bissexto se o mês é 2 e o dia é 29
		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

		this.month = month;
		this.day = day;
		this.year = year;

		System.out.printf("Date object constructor for date %s%n", this);
	}
	
	public Date() {}

	public int getMonth() 
	{
		return month;
	}

	public void setMonth(int month) 
	{
		this.month = month;
	}

	public int getDay() 
	{
		return day;
	}

	public void setDay(int day) 
	{
		this.day = day;
	}

	public int getYear() 
	{
		return year;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}

	/**
	 * Retorna uma String no formato mes/dia/ano
	 * 
	 * @return {@link String} 
	 */
	public String toString() 
	{
		return String.format("%d/%d/%d", month, day, year);
	}
}
