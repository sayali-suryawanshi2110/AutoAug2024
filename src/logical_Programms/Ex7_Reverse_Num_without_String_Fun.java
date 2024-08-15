package logical_Programms;



public class Ex7_Reverse_Num_without_String_Fun 
{
 public static void main(String[] args)
 {
	  int orgNum=842113433;
	  int revNum=0;
	  
	  for(int i=orgNum;i>0;i=i/10)
	  {
		int rem =i%10;
		revNum=revNum*10+rem;
		
	  }
	  System.out.println(orgNum);
		System.out.println(revNum);
}

}
