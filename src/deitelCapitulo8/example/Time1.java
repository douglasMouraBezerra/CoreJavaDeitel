package deitelCapitulo8.example;

public class Time1
{
	private int hour, minute, second;

	//pattern construct
	
	
	public void setTime(int h, int m, int s) 
	{
		if(h < 0 || h >= 60 || m < 0 || m >= 60 || s < 0 || s >= 60)
		{
			throw new IllegalArgumentException("hour, minute or second was out of the range.");
		}
		
		setHour(h);
		setMinute(m);
		setSecond(s);
		
	}
	
	private void setHour(int hour) 
	{
		this.hour = hour;
	}
	
	private void setMinute(int minute) 
	{
		this.minute = minute;
	}
	
	private void setSecond(int second) 
	{
		this.second = second;
	}

	public String toUniversalString()
	{
		return String.format("%02d:%02d:%02d", this.hour, this.minute,this.second);
	}
	
	public String toString()
	{
		return String.format("%d:%02d:%02d %s"
				,(hour == 0 || hour == 12 ? 12 : hour % 12)
				,minute
				,second
				,(hour < 12 ? "AM" : "PM"));
	}	
}
