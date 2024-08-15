package Access_Specifiers;

public class Ex4_Public
{
	int d;
	
	Ex4_Public()
	{
		d=40;
	}
	public void m4()
	{
		System.out.println("public access specifiers");
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		Ex4_Public j=new Ex4_Public();
		j.m4();
		
	}

}
