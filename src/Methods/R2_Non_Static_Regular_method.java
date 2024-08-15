package Methods;

public class R2_Non_Static_Regular_method 
{
	public void j1()
	{
		System.out.println("non static method j1");
	}
	public void j2()
	{
		System.out.println("non static method j2");
	}
	public static void main(String[] args) 
	
	{   //same class
		//for non static method we have to create object of current class
		
		R2_Non_Static_Regular_method non=new R2_Non_Static_Regular_method();
		non.j1();
		non.j2();
		
		//different class
		
		Regular_method diff=new Regular_method();
		diff.m3();
		diff.m4();
	//	diff.m1();
		
		
	}

}
