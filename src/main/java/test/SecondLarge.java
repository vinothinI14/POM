package test;

public class SecondLarge {

	public static void main(String[] args) {
		int [] arr= {1,21,2,11,34,56,78};
		int i,firstLaege=arr[0],secondLarge=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>firstLaege)
			{
				secondLarge=firstLaege;
				firstLaege=arr[i];
			}
			else if(arr[i]>secondLarge)
			{
				secondLarge=arr[i];
			}
		}
System.out.println("The second largest number in an array="+secondLarge);
	}

}
