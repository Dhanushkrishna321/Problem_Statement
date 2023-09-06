//problem statement RandomOperator Math

import java.util.Random;

public class RandomOperatorMath 
{
	public static void main(String[] args)
	{
	Random rand = new Random();
	int n1 = rand.nextInt(6) + 1;
	int n2 = rand.nextInt(6) + 1;
	int sum = n1 + n2;
	System.out.println(sum);
	}
}