package logical_Programms;

public class Ex6_Reverse_String 
{
	public static void main(String[] args) 
	{
		String org="sayali";
		String rev="";
		
		//string information always store in index forms
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
	}

}
