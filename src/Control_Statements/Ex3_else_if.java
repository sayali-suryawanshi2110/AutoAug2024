package Control_Statements;

public class Ex3_else_if 
{
  public static void main(String[] args) 
  {
	  int marks=60;
	  if(marks<=35)
	  {
		  System.out.println("pass");
	  }
	  else if(marks>=35 &marks<=55)
	  {
		  System.out.println("distiction");
	  }
	  else if(marks>=55 &marks<=80)
	  {
		  System.out.println("1st class");
	  }
	  else
	  {
		  System.out.println("fail");
	  }
	
}
}
