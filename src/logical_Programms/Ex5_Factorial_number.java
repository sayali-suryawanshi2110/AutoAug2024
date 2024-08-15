package logical_Programms;

import java.util.Scanner;

public class Ex5_Factorial_number 
{
	public static void main(String[] args)
	{ 
		//in forward direction

//		int num=3;
//		int fact=1;
//		
//		for(int i=1; i<=num; i++)
//		{
//			fact=fact*i;
//		}
//		System.out.println(fact);
	
	
	//in backward direction
    
//	 int num=5;
//     int fact=1;
//     for(int i=num; i>=1;i--)
//     {
//    	 fact=fact*i;
//     }
//	System.out.println(fact);
	
	//by using scanner class
		
		int num;
		int fact=1;
		System.out.println("inter value");
		Scanner x=new Scanner(System.in);
		num=x.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of number  :"+fact);
		
	}  
}
