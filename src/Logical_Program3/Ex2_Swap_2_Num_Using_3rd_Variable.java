package Logical_Program3;

public class Ex2_Swap_2_Num_Using_3rd_Variable
{
	public static void main(String[] args) 
	{
	  	int first=10;
	  	int second=20;
	  	int temp;
	  	System.out.println("before swapping");
	  	System.out.println("first num :" +first);
	  	System.out.println("second num :" +second);
	  	
	  	temp=first;
	  	first=second;
	  	second=temp;
	  	
	  	System.out.println("after swapping");
	  	System.out.println("first num :" +first);
	  	System.out.println("second num :" +second);
	  			
	}

}
