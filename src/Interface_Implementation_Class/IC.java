package Interface_Implementation_Class;

public class IC 
{
	public void m1()
	{
		System.out.println("method m1 from Interface I1 is completed ");
	}
	public void m2()
	{
		System.out.println("method m2 from Interface I1 is completed ");
	}
	public void m3()
	{
		System.out.println("method m3 from Interface I2 is completed ");
	}
	public void m4()
	{
		System.out.println("method m4 from Interface I2 is completed ");
	}
	public static void main(String[] args)
	{
		IC i=new IC();
		i.m1();
		i.m2();
		i.m3();
		i.m4();
		
	}

}
