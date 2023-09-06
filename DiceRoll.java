//problem statement dice roll

import java.util.Random;
public class DiceRoll
{
	public static void main(String[] args)
	{
	Random obj = new Random();
	int n1 = obj.nextInt(6) + 1;
	int n2 = obj.nextInt(6) + 1;
	int sum = n1 + n2;
	System.out.println("The Sum of " + n1 + " and " + n2 + " is: "+ sum);
}
}