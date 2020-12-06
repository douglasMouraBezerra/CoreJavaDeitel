package deitelCapitulo8.exercise;

import deitelCapitulo8.example.Time2;

public class ModifyTime2 {
	private int hour;
	private int minute;
	private int second;
	
	public ModifyTime2() 
	{
		this(0,0,0);
	}
	
	public ModifyTime2(int h, int m, int s)
	{
		if(h < 0 || h >= 24)
			throw new IllegalArgumentException("hour must be among 1 and  24");
		
		if(m < 0 || m >= 60)
			throw new IllegalArgumentException("minute must be among 1 and  60");
		
		if(s < 0 || s >= 60)
			throw new IllegalArgumentException("second must be among 1 and  60");
		
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
		
	
	public ModifyTime2(int hour)
	{
		this(hour,0,0);
	}

	public ModifyTime2(int hour, int minute)
	{
		this(hour,minute,0);
	}	
	
	public ModifyTime2(Time2 time)
	{
		this(time.getHour(),time.getMinute(),time.getSecond());
	}
		
	public void setTime(int h, int m, int s)
	{		
		hour = h;
		minute = m;
		second = s;
	}
		
	public void setHour(int hour)
	{
		if(hour < 0 || hour >= 24) 
		{
			throw new IllegalArgumentException("hour must be among 1 and  24");
		}
		this.hour = hour;
	}
	
	public void setMinute(int minute) 
	{
		if(minute < 0 || minute >= 60) 
		{
			throw new IllegalArgumentException("minute must be among 1 and  60");
		}
		this.minute = minute;
	}
	
	public void setSecond(int second) 
	{
		if(second < 0 || second >= 60) 
		{
			throw new IllegalArgumentException("second must be among 1 and  60");
		}
		this.second = second;
	}
	
	public int getHour() 
	{
		return hour;
	}

	public int getMinute() 
	{
		return minute;
	}

	public int getSecond() 
	{
		return second;
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
