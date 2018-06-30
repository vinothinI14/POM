package test;

public class PairOfSum {
public static void main(String[] args) {
	int input=10;
	int arr[]= {1,3,5,7,9};
	for(int i=0;i<arr.length;i++)
	{
		String str="";
		for(int j=i+1;j<arr.length;j++)
		{
			
			if((arr[i]+arr[j])==input)
			{
				System.out.println("Pair of sum ="+input);
			}

		}
	}
}
}
