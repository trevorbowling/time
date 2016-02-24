/*
* Date: July 20, 2014
* Purpose:
*/


public class Time
{

private int hour;
private int minute;
private int second;

public Time()
{
this(System.currentTimeMillis());
}

public Time(long elapsedTime)
{
setTime(elapsedTime);
}

@Override
public String toString()

{
	return hour + ":" + minute + ":" + second + "GMT";
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

public void setTime(long elapsedTime)
{
	//Declarations
	long totalSeconds, totalMinutes, totalHours;

	//Obtain the total seconds since the midnight, Jan 1, 1970
	totalSeconds = elapsedTime / 1000;

	//Compute the current second in the minute in the hour
	second = (int) (totalSeconds % 60);

	//Obtain the total minutes
	totalMinutes = totalSeconds / 60;

	//Compute the current minute in the hour
	minute = (int) (totalMinutes % 60);

	//Obtain the total hours
	totalHours = (int) (totalMinutes / 60);

	//Compute the current hour
	hour = (int) (totalHours % 24);
}
}

