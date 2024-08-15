package Access_Specifiers;

public class Ex3_Protected
{
    protected int c;
  
     protected Ex3_Protected()
    {
	   c=30;
    }
     protected void m3()
     {
    	System.out.println("protected specifiers"); 
    	System.out.println(c);
     }
     public static void main(String[] args) 
     {
    	 Ex3_Protected h=new Ex3_Protected();
    	 h.m3();
    	 
		
	}
}
