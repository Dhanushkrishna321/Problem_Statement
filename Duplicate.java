//problem statement print dublicate element present or not

public class Duplicate
{
	public static void main(String[] args){
	int[] arr = {1,2,3,4,1};
	int[] arr1 = new int[arr.length]; 
	for(int i = 0; i<arr.length;i++){
         for(int j = i+1; j < arr.length;j++){
	if(arr[i]==arr[j]){
	arr1[i]=arr[j];
	System.out.println(arr[j]);
	}
	}
	}
if(arr1[0]!=0)
{
System.out.println("Array contains a Dublicate Elements");
}
else{
System.out.println("Array not have a Dublicate Elements");
}	
}
}