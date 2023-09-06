
//problem statement reverse the given num
public class Reverse
{ 
 static int remainder, number = 321, reverse = 0;
	public static void main(String[] args)
	{

	while(number!=0)
	{
	remainder = number % 10;
	reverse = reverse * 10 + remainder;
	number = number /10;
        }
	System.out.println("The reverse of the given number is: " + reverse); 
	}
}