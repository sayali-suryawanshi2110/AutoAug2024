package This_Super_Keywords;

public class sample2  extends sample1
{
	//sub class
	int b=20;   //global variable
	
	public void m1()
	{
		
		int c=30; //local variable
		System.out.println(this.b);
		System.out.println(c);
		System.out.println(super.a);
		System.out.println(super.a);
		
	}
	public static void main(String[] args)
	{
		sample2 s=new sample2();
		s.m1();
		
	}

}
