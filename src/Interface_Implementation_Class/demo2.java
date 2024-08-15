package Interface_Implementation_Class;

public class demo2  implements demo1
{
	//Implementation class
	public void m1()
	{
		System.out.println(a);
		System.out.println("m1 from interface completed in implementation class");
	}
	public void m2()
	{
		
		System.out.println("m2 from interface completed in implementation class");
	}
	public static void main(String[] args)
	{
		demo2 d=new demo2();
		d.m1();
		d.m2();
		
		
	}

}
