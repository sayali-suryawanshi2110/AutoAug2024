package Array;

import java.util.Arrays;

public class Ex4_intArry_sorting 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[4];
		
		ar[0]=50;
		ar[1]=20;
		ar[2]=40;
		ar[3]=60;
		
		System.out.println("------original data-------");
		for(int i=0;i<=ar.length-1;i++)
			
		{
			System.out.println(ar[i]);
		}
		Arrays.sort(ar);
		System.out.println("------ascendings order-------");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("------descendings order-------");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}

}
