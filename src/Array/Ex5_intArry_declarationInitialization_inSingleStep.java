package Array;

import java.util.Arrays;

public class Ex5_intArry_declarationInitialization_inSingleStep
{
  public static void main(String[] args) 
  {
	  int [] ar= {10,20,30,40};
	  
	  System.out.println(ar[1]);
	  Arrays.sort(ar);
	 
	  for(int i=ar.length-1;i>=0;i--)
	  {
		  System.out.println(ar[i]);
	  }
	
}
}
