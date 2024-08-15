package logical_Programms;

import java.util.Scanner;

public class ex11_Add_Two_Num_From_User 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("enter 2 numbers");
	try(Scanner s=new Scanner(System.in);)
	{
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
	}
		System.out.println(c);
	}

}
