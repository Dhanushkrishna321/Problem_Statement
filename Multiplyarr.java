//problem statement to multiply the array with 2.5

public class Multiplyarr
{
	public static void main(String[] args)
	{
	double arr[] = {2,3,1,4,5,6};
	double arr1[] = new double[arr.length];
	for(int i = 0; i<arr.length; i++)
	{
	 double x = arr[i] * 2.5;
	 arr1[i] = x;
	}
for(int j =0; j < arr1.length; j++)
{
System.out.print(arr1[j]+ " ");
}
}
} 