//problem statement sorting the givenarray

public class Sorting
{
	public static void main(String[] args)
	{
	int[] arr = new int[]{45,32,76,43,90,51,73,87};

	System.out.println("The original array: ");
	for(int i = 0; i<arr.length;i++){
	System.out.print(arr[i] + " ");
	}
	System.out.println("\n");
	System.out.println("The Sorted array are: ");
	int temp = 0;
	
	for(int i = 0; i<arr.length; i++)
	{
	for(int j = i + 1; j<arr.length; j++)
	{
	if(arr[i] > arr[j]){
	temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
	}}
	System.out.print(arr[i] + " ");
	
}
System.out.println("\n");
int n = arr.length;
System.out.println("The Reverse array: ");
while(n != 0)
{

System.out.print(arr[n-1] +" ");
n = n-1;

}





}}