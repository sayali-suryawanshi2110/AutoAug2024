package String;

public class sample2
{
 public static void main(String[] args) 
 {
	 String s1="velocity";
	 String s2="ABCD";
	 String s3="abcd";
	 String s4="my name is sayali";
	 String s5="abcabab";
	
	 System.out.println(s1.length());
	 System.out.println(s3.toUpperCase());
	 System.out.println(s2.toLowerCase());
	 System.out.println(s2.equals(s3)); //data and case same pahije
	 
	 System.out.println(s2.equalsIgnoreCase(s3));//case ignore
	 
	 System.out.println(s4.contains("sayali"));
	 System.out.println(s4.startsWith("my"));
	 System.out.println(s4.endsWith("sayali"));
	 
	 System.out.println(s5.isEmpty());
	 System.out.println(s1.charAt(0));
	 System.out.println(s5.indexOf("a")); //first occurance of a
	 System.out.println(s5.lastIndexOf("b")); //last occurance of b
	 
	 System.out.println(s1.substring(2)); //index 2 nanter print hote
	 
	 System.out.println(s1.concat(s5));
	 System.out.println(s4.replace("sayali", "jayesh"));
	 
	 
}
}
