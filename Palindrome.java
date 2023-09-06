//problem statement check palindrome or not

public class Palindrome
{
  static int n, num = 432, remainder, rev = 0;
	public static void main(String[] args)
	{
	n = num;
	while(num!=0)
	{
	remainder = num % 10;
	rev = rev * 10 + remainder;
	num = num/10;
	}
	System.out.println("The reverse of given number: "+ rev);

	if(n == rev)
	{
	System.out.println("given number is palindrome");
	}
	else
	{
	System.out.println("Given number is not palindrome");
	}
	
	
	}
}