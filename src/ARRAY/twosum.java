package ARRAY;

public class twosum {
	
	public static void main(String[]args)
	{
		int arr[]= {2,3,4,5,7,8,12};
		int targer=14;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==targer)
				{
					System.out.println("target found "+ arr[i] +" " +arr[j] +" =");
				}
				
			}
		}
	}

}
