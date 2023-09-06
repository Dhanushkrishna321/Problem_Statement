//problem statement print three names



public class PrintThreeNames
{
	public static void main(String[] args)
	{
	String arr[] = {"Mohan", "Dilip" , "Manu"};

	if(arr.length == 0){
	System.out.println("no names...!!!");
	}

	System.out.print("Hi!, my friends are : ");
	int n = arr.length;
	
	for(int i = 0; i < n; i++){
	System.out.print(arr[i]);
	if(i == n-2){
	System.out.print(" and ");
	}
	else if(i != n-2){
	System.out.print(" , ");
	}
	
	}

	
	}
}