package Array;

public class Ex8_Multidimensional_Array 
{
        //  0  1  2
		//0 10 20 30
		//1 40 50 60
	
	public static void main(String[] args) 
	{
		int[][] ar= {{10,20,30},{40,50,60}}; //rows n cols
	      
		  for(int i=0;i<=1;i++)
		  {
			  for(int j=0;j<=2;j++)
			  {
				System.out.print(ar[i][j]+" ");  
			  }
			  System.out.println();
		  }
		
	}
}
