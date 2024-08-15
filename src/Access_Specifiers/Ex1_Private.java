package Access_Specifiers;

public class Ex1_Private 
{
	private int a; //variable
	
	private Ex1_Private() //constructor
	{
		a=10;
	}
	
	private void m1()  //method
	{
		System.out.println("private access specifier");
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		Ex1_Private x=new Ex1_Private();
		x.m1();
		
	}
  
}
