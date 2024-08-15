package Inheritance;

public class son2 extends son1
{
	//multilevel inheritance
	public void mob2()
	   {
		 System.out.println("mob2:iphone");  
	   }

	public static void main(String[] args)
	{
		son2 s1=new son2();
		s1.car();
		s1.home();
		s1.money();
		s1.mob();
		s1.mob1();
		s1.mob2();
		
	}
}
