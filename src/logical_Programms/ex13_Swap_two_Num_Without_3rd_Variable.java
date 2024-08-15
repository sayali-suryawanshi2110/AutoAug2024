package logical_Programms;

public class ex13_Swap_two_Num_Without_3rd_Variable
{
	public static void main(String[] args)
	{
		int firstNum=1000;
		int secondNum=2000;
		
		System.out.println("before swapping");
		System.out.println("first number :"+firstNum);
		System.out.println("second number :"+secondNum);
		
		firstNum=firstNum+secondNum;
		secondNum=firstNum-secondNum;
		firstNum=firstNum-secondNum;
		
		System.out.println("after swapping");
		System.out.println("first number :"+firstNum);
		System.out.println("second number :"+secondNum);
	}

}
