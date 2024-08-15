package Array;



public class Ex2_Int_Array
{
  public static void main(String[] args) 
  {
	int [] ar=new int [4];
	
	ar[0]=10;
	ar[1]=20;
	ar[2]=30;
	ar[3]=40;
	
	System.out.println(ar[1]);
	System.out.println(ar.length);
	for(int i=0;i<=ar.length-1;i++) 
	{
		System.out.println(ar[i]);
	}
	
  }
}
