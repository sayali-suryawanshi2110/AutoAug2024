package logical_Programms;

public class Ex3_Swap_two_Num_Without_3rd_Variable 
{
 public static void main(String[] args) 
 {
	 int num1=20;
	 int num2=30;
	 System.out.println("before swap");
	 System.out.println("first number :"+num1);
	 System.out.println("second number :"+num2);
	 
	 num1=num1+num2; //20+30=50
	 num2=num1-num2;  //50-30=20
	 num1=num1-num2;   //50-20=30
	 
	 System.out.println("after swap");
	 System.out.println("first number :"+num1);
	 System.out.println("second number :"+num2);
	 
}
}
