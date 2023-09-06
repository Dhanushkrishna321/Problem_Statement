//problem statement print random number between 1 to 10

public class Random
{
	public static void main(String[] args)
	{
	Random obj = new Random();
	int arr[] = new int[10];


for(int i = 0; i<10; i++)
{
int num = obj.nextInt(11);
arr[i]= num;
System.out.print(arr[i] + " ");
}

}}

