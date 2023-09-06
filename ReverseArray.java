//problem statement reverse the given array

public class ReverseArray
{
	public static void main(String[] args)
	{
	int[] arr = new int[]{45,32,76,43,90,51,73,87};
	int i = arr.length;
	System.out.println("The Reverse of array elements are: ");
	while(i!=0)
	{
	System.out.print(arr[i-1] + " ");
	i = i-1;
	}
}
}	