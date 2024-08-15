package Abstract_And_Concrete_Class;

abstract public class sample1
{
   //abstract class
	
	// complete method
	public void m1()  //method declaration
	{
		System.out.println("method m1 running");  //method defination
	}
	
	// complete method
		public void m2()  //method declaration
		{
			System.out.println("method m2 running");  //method defination
		}
	//incomplete method
		abstract public void m3(); //method declaration
     
		//incomplete method
		abstract public void m4(); //method declaration
}
