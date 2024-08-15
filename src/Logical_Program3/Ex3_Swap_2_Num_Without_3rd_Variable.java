package Logical_Program3;

public class Ex3_Swap_2_Num_Without_3rd_Variable 
{
  public static void main(String[] args) 
  {
	  int a=10;
	  int b=20;
		System.out.println("before swapping");
	  	System.out.println(" a : " +a);
	  	System.out.println("  b  :" +b);
	  	a=a+b;  //30
	  	b=a-b; //30-20=10
	  	a=a-b;//30-10=20
	  	
		System.out.println("after swapping");
	  	System.out.println(" a : " +a);
	  	System.out.println("  b  :" +b);
	
}
}
