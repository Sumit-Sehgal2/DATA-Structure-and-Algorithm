package ARRAY;

import java.util.Scanner;

public class takinginput {
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of Size");
		int n= sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
			
		}
		System.out.println("i am the elemet of an Array");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				//System.out.println(arr[i]);
			}
			
			//System.out.println(arr[i]*2);
		}
	}

}
