//problem statement static block

public class Static_block
{ static int x = 5;
  static int y;
	public static void printelements(int z)
	{
	System.out.println("X = " + x);
	System.out.println("y = " + y);
	System.out.println("z = " + z);
	}
	static
	{
	System.out.println("Running static initialization block.");
	y = x + 3;
	}

	public static void main(String[] args)
	{
	printelements(8);
	}
	
}