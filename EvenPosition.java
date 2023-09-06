//problem statement print even position number in array

public class EvenPosition
{
	public static void main(String[] args)
	{
	int[] arr = new int[]{45,32,76,43,90,51,73,87};
	System.out.println("The Even Position number are: ");
	int i=1, j;
	while(i < arr.length)
	{
	
	System.out.println(arr[i]); 
	i = i + 2 ; 
	}
	
	System.out.println("The odd Position number are: ");
	for(j=0; j < arr.length; j =j+2)
	{
	
	System.out.println(arr[j]); 
	
	}
	
}
}