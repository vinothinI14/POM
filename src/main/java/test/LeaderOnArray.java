package test;

public class LeaderOnArray {

	public static void main(String[] args) {
		int arr[]= {14,2,34,7,21,6};
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=true;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(arr[i]+ " ");
			}

		}
		
		
	}

}
