package ARRAY;

import java.util.Scanner;

public class sumofanarray {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size if an Array");
		int n= sc.nextInt();
		int result=1;
		int max=Integer.MIN_VALUE;
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		System.out.println("i am the highest number of an array " + max);
		//System.out.println("total sum of an array " + result);
	}

}
