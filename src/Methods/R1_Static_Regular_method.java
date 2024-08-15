package Methods;

public class R1_Static_Regular_method
{
	public static void s1()   //static regular method
	{
		System.out.println("s1 static regular method");
	}
	public static void s2()   //static regular method
	{
		System.out.println(" s2 static regular method");	
	}
	
	public static void main(String[] args) 
	{
		s1();    //static method running from same class
		s2();    //i.e. method name ();
		
		Regular_method.m1();    //static method running from diff class
		Regular_method.m2();   //diff classNmae.method_name();
	}

}
