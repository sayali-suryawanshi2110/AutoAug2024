package Constructor;

public class Ex3_Without_Parameter 
{
	int a;
	int b;
	
	Ex3_Without_Parameter()
	{
		a=1;
		b=2;
	}
	public void add()
	{
		System.out.println(a+b);
		
	}
	public static void main(String[] args)
	{
		Ex3_Without_Parameter con =new Ex3_Without_Parameter();
		con.add();
		
	}

}
