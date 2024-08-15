package logical_Programms;

public class ex17_Reverse_Num_without_String_Fun 
{
 public static void main(String[] args) 
 {
	 int orgNum=12345;
	 int revNum=0;  //0
	          //12345  //12345>0   12345/10=5
	 for(int i=orgNum; i>0; i=i/10)
	 {
		   //12345%10=5 store in rem
		 int rem=i%10;  
		 revNum=revNum*10+rem;	 //0*10+5=5 store in revNum
	 }
	System.out.println(orgNum);
	System.out.println(revNum);
}
}
