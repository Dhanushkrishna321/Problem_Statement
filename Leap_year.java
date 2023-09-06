//problem statement to check leap year

public class Leap_year
{
static int i = 1800;
static boolean leap = false;
	public static void main(String[] args)
	{
	if(i%4==0)
	{
		if(i%100==0)
		{
			if(i%400==0)
			{
			leap = true;
			}
			else
			{
			leap = false;
			}
		}
		else
		{
		leap = true;
		}
		

	}
	else
	{
	leap = false;
	}

	if(leap)
	{
	System.out.println("given year is leap year");
	}
	else
	{
	System.out.println("given year is not leap year");
	}
	
		
	}

}