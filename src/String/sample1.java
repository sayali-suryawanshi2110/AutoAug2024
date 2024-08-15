package String;

public class sample1
{
	public static void main(String[] args) 
	{
		//only declaration
		String s1; 
		
		//declaration & initialization
		String s2="abcd";
		
		//----------------------
		String s3="ab";
				
		//re initialisation
			s3=s3+"cd";	 //abcd
		
		   String s4=s3+"xyz"; //abcdxyz
		//---------------------------
		   
	    //object creation of String
		
	    //1: without using new keyword
	     String str="abcdef";
	     
	   //2: with using new keyword
	     String str1=new String("xyz");
	     
	     //========================
	   //1: without  new keyword
	     String s15="abc";  // duplicate obj info not allowed
	     String s16="abc";
	     String s17="abc1";
	     
	   //2: using  new keyword
	     
	     String s21=new String("pqr");// duplicate obj info  allowed
	     String s22=new String("pqr");
	     
	}

}
