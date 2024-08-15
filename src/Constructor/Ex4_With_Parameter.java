package Constructor;

public class Ex4_With_Parameter 
{
	int num1;
	int num2;
	Ex4_With_Parameter(int a,int b)
	{
		num1=a;
		num2=b;
	}
  public void add()
  {
	  System.out.println(num1+num2);
  }
  public static void main(String[] args) 
  {
	  Ex4_With_Parameter con = new Ex4_With_Parameter(10,20);
	  con.add();
	
}
}
