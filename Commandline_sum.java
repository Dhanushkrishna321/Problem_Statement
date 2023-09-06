//Problem Statement Commandline argument to sum

public class Commandline_sum
{
	public static void main(String[] args)
	{
 	 int sum = 0;
	System.out.println("Sum the given integer Command line: ");
	for(int i = 0; i<args.length;i++)
	{
 	System.out.println(args[i]);
	sum = sum + Integer.parseInt(args[i]);
	}
	System.out.println("Sum of CommandLine: " + sum);
	}
}
