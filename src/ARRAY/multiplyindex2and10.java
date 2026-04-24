package ARRAY;

import java.util.Scanner;

public class multiplyindex2and10 {
	int odd=1;
	int even=1;
	
	public static void main(String[]args)
	{
		System.out.println("enter the size of an array");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
	
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
	
		
		multiplyindex2and10 m1=new multiplyindex2and10();
		m1.get(arr);
	}
	
	
	public void get(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
				
			{
			odd=	arr[i]*2;
				System.out.println("i am an odd number" + odd);
			}
			if(arr[i]%2==0)
			{
				even=arr[i]*10;
				System.out.print("i am an even number in an array" + even);
			}
			
		}
		
		
		return ;
	}

}
