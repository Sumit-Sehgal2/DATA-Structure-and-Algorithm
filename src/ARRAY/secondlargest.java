package ARRAY;

public class secondlargest {
	
	public static void main(String[]args)
	{
		int arr[]= {12,3,4,5,6,7,8,9,100};
		int min=Integer.MIN_VALUE;
		int secondmax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>min)
			{
				min=arr[i];
				
			}
		}
		System.out.print("i am an largest element of an array" + min);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>secondmax &&arr[i]<min)
			{
				secondmax=arr[i];
			}
			
		}
		System.out.println("i am the second largest element in an array" + secondmax);
		
	}

}
