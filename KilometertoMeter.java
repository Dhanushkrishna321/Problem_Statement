//problem statement to calculate the kilometer to meter

import java.util.Scanner;
public class KilometertoMeter
{
	public static void main(String[] args)
	{
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the Kilometer per hour: ");
	double km = obj.nextDouble();
	double meter = km * 0.2777;
	System.out.println(km + " km/h in m/s: "+ meter);
}
}
	