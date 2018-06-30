package test;

public class MissingElement {

	public static void main(String[] args) {
		int arr1[]= {3,4,6,7,1,9,12};
		for(int i=0;i<arr1.length-1;i++)
		{
			if(arr1[i+1]!=arr1[i]+1)
			{
				int missEle=arr1[i]+1;
				System.out.println(missEle);
			}
			
		}
		

	}

}
