package logical_Programms;

public class ex12_Swap_two_Num_Using_3rd_Variable 
{
	public static void main(String[] args) 
	{
		int first=21;
		int second =8;
		int temp;
		System.out.println("before swapping");
		System.out.println("first num :" +first);
		System.out.println("second num :"+second);
		
		temp=first;
		first=second;
		second =temp;
		System.out.println("after swapping");
		System.out.println("first num :" +first);
		System.out.println("second num :"+second);
		
	}

}
