package Generalisation;

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("------features of Jio---------");
		Jio j=new Jio();
		j.ac();
		j.data();
		j.sms();
		
		System.out.println("------features of Airtel---------");
		Airtel a=new Airtel();
		a.ac();
		a.data();
		a.sms();
		
		
		System.out.println("------features of Idea---------");
		
		Idea i=new Idea();
		i.ac();
		i.data();
		i.sms();
		
	}

}
