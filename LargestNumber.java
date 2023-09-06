//problem statement to check largest and smallest num in array

public class LargestNumber
{
	public static void main(String[] args)
	{
	int[] arr = new int[]{45,32,76,43,90,51,73,87}; 
	int max, min;
	max = arr[0];
        min = arr[0];
	for(int i = 0; i<arr.length; i++)
	{
	if(arr[i]>max)
	max = arr[i];
	}
	System.out.println("Largest number is: " + max);

	for(int j = 0; j<arr.length; j++)
	{
	if(arr[j]<min)
	min = arr[j];
	}
	System.out.println("The smallest number is: " +min);
}
}