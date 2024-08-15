package Logical_Programms2;

public class Ex2_Swap_two_Num_using_3rd_variable
{
 public static void main(String[] args) 
 {
	int num1=1000;
	int num2=300;
	int temp;
	System.out.println("before swapping");
	System.out.println("num1  :"+num1);
	System.out.println("num2  :"+num2);
	
	
	temp=num1;
	num1=num2;
	num2=temp;
	System.out.println("after swapping");
	System.out.println("num1  :"+num1);
	System.out.println("num2  :"+num2);
	
	
}
}
