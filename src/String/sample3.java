package String;

public class sample3
{
 public static void main(String[] args) 
 {
	 String s1="my name is sayali";
	 
	 String [] ar=s1.split(" "); //{my(0) name(1)  is(2)  sayali(3)}
	 
	 System.out.println(ar[3]);
	 
	 for(int i=0;i<=ar.length-1;i++)
	 {
		 System.out.println(ar[i]);
	 }
	
}
}
