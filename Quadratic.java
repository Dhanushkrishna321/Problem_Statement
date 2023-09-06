//problem statement Quadraic equation

import java.lang.Math;
import java.util.Scanner;
public class Quadratic
{
	public static void main(String[] args)
	{
	Scanner obj = new Scanner(System.in);

	System.out.println("Enter the a value: ");
	double a = obj.nextDouble();

	System.out.println("Enter the b value: ");
	double b = obj.nextDouble();

	System.out.println("Enter the c value: ");
	double c = obj.nextDouble();

	double delta = (b*b)-(4*a*c);
	System.out.println(delta);
	double positive = (-b + Math.sqrt(delta))/(2 * a);
	double negative = (-b - Math.sqrt(delta))/(2 * a);
	System.out.println("The Root x1 Positive: " + positive);
	System.out.println("The Root x2 negative: " + negative);
}
}