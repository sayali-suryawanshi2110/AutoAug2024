package Polymorphism;

public class TestOverriding
{
   public static void main(String[] args)
   {
	   Son s=new Son();
	   s.home();
	   s.money();
	   s.car();
	   
	   System.out.println("--------------------------------------------------");
	   
	   father f=new father();
	   f.home();
	   f.car();f.money();
	
}
}
