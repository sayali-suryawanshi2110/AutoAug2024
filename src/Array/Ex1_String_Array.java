package Array;

public class Ex1_String_Array
{
 public static void main(String[] args)
 {
	 //declaration
	   String[] ar=new String[5];
	
	 //initialisation
	   ar[0]="sayali";
	   ar[1]="jayesh";
	   ar[2]="vivek";
	   ar[3]="rina";
	   ar[4]="tina";
	 
	 //usage
	 System.out.println(ar[3]);
	 System.out.println(ar.length);
	 
	 for(int i=0;i<=ar.length-1; i++)
	 {
		 System.out.println(ar[i]);
	 }
	
}
}
