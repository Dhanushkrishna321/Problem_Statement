//problem statement to check given no is odd or even
import java.util.Scanner;
public class EvenOdd
{
	public static void main(String[] args)
	{
	System.out.println("Enter the number to check: ");
	Scanner obj = new Scanner(System.in);
	int i = obj.nextInt();
	if(i%2==0)
	{
	System.out.println(i+" is even number");
	}
	else{
	System.out.println(i+" is odd number");
	}
}
}