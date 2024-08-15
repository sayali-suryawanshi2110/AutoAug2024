package Variables;

public class Non_static_Variable 
{
  int a=10; //Non_static_Variable
  public  void m2()
  {
	  int b=20;  //local variable
	  System.out.println(b);
	 	  
  }
  public static void main(String[] args) 
  {
	  Non_static_Variable non=new Non_static_Variable();
	  non.m2();
	 // System.out.println(a);
	
}
	
}
