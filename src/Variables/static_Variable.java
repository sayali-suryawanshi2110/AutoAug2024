package Variables;

public class static_Variable  
{ 
	static int a =100;  //global variable
	
	public static void m1()
	{
	    int b=200;    //local variable
	    System.out.println(b);
	    
	 }
	public static void main(String[] args) 
	{
		m1();
		System.out.println(a);
	}

}
