package Access_Specifiers;

public class Ex2_Default 
{
	int b;
	
	Ex2_Default()
	{
		b=20;
	}
	public void m2()
	{
		System.out.println("default specifier");
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		Ex2_Default v=new Ex2_Default();
		v.m2();
				
		
	}

}
