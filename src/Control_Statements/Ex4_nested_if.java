package Control_Statements;

public class Ex4_nested_if 
{
public static void main(String[] args) 
{
	int marks=50;
	if(marks>=50)
	{
		System.out.println("eligible");
		if(marks <=50 & marks >70)
		{
			System.out.println("qualify main ");
		}
		else
		{
			System.out.println("qalify for interview");
		}
	}
	else
	{
		System.out.println("fail");
	}
	
}
}
