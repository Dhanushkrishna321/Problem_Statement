// Problem Statement Array Passing to method
public class ArrayMethod
{
	public static int[] array(int arr[])
	{
	
	return arr;

	}

	public static void main(String[] args)
	{
	int arr[] = {1,2,3,4,5};
	int arr1[] = array(arr);
	 

	for(int i = 0; i<arr1.length; i++)
	{
	System.out.println(arr1[i]);
	}
	
}
}