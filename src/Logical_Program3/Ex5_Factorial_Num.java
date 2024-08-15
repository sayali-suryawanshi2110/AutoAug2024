package Logical_Program3;

public class Ex5_Factorial_Num
{
	public static void main(String[] args) 
	{
		int a=3;    
		             
		int fact=1;
		            //3<=3
		            //2<=3  2+1=3
		           //1<=3  1+1=2
		for(int i=1;i<=a; i++)
		{
			fact=fact*i;  //1*1=1
			              //2*1=2
			              //2*3=6
		}
		System.out.println(fact);
	}

}
