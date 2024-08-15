package Logical_Programms2;

public class Ex3_Swap_two_Num_Without_3rd_variable 
{
	public static void main(String[] args) 
	{
		int num1=111;
		int num2=222;
		
		System.out.println("before swapping");
		System.out.println("num1  :"+num1);
		System.out.println("num2  :"+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("after swapping");
		System.out.println("num1  :"+num1);
		System.out.println("num2  :"+num2);
	}

}
