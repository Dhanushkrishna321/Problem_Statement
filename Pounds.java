
//problem statement to convert pounds into kg
import java.util.Scanner;
public class Pounds
{
	public static void main(String[] args)
	{
	Scanner obj = new Scanner(System.in);

	System.out.print("Enter the Pounds to Convert: ");
	double pound = obj.nextDouble();

	if(pound != 0)
	{
	double grams = pound *  453.592;
	double kg = grams / 1000;
	System.out.println(pound + " pounds in kilograms: " + kg + "kg");
	}
	else
	{
	System.out.println("Enter the vaild pounds to calculate!!!");
	}
}
}
