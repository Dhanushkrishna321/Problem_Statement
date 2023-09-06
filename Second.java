//problem statement convert the second into time

import java.util.Scanner;
public class Second
{
	public static void main(String[] args)
	{
	Scanner obj = new Scanner(System.in);

	System.out.println("Enter the Seconds to Convert: ");
	int input = obj.nextInt();
	int hour = input / 3600;
	int min = (input % 3600)/60;
	int sec = (input % 3600) % 60;
	System.out.println(input +" secs = " + hour + " hr " + min + " min " + sec + " sec ");
}
}