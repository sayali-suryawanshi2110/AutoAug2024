package Inheritance;

public class son extends father
{
	//single level inheritance
	public void mob()
	   {
		 System.out.println("mob:samsung");  
	   }
	public static void main(String[] args)
	{
		son s=new son();
		s.car();
		s.home();
		s.money();
		s.mob();
		
	}

}
