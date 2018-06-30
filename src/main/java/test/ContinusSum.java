package test;

public class ContinusSum {
	public static void main(String[] args) {
		int arr[]= {2,6,3,8,4};
		int sum,input=12;
		String str;
		for(int i=0;i<arr.length;i++)
		{
			sum=0;
			str="";
			for(int j=i;j<arr.length;j++)
			{
				sum=sum+arr[j];
				str=str+arr[j]+", ";
				if(sum==input)
				{
				System.out.println("sum"+sum+ "array:"+ "["+str+"]");	
				}
			}
		}
	}

}
