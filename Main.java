//problem statement using interface method

interface Car{
 	public void name();
	

}

class Tatacar implements Car{
	public void name(){
	System.out.println("i am in tatacar class");
}
}

public class Main{
 	public static void main(String[] args){
	
	Tatacar obj1 = new Tatacar();

	
	obj1.name();

}

}