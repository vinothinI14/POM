package test;

import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,6};
		int b[]= {1,3,4,5,6};
		
		boolean equalOrNot=true;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					equalOrNot=false;
				}
			}
		}
		else
		{
			equalOrNot=false;
		}
	if(equalOrNot)
	{
		System.out.println("Two arrays are equal");
	}
	else
	{
		System.out.println("Two arrays are not equal");
	}
	String str[]= {"vino", "kutty", "Suvi", "Sadhana"};
	String str1[]= {"Sadhana","kutty", "vino", "Suvi"};
	Arrays.sort(str1);
	Arrays.sort(str);
	System.out.println(Arrays.equals(str, str1));
	
	System.out.println(Arrays.equals(a, b));
	
	
	}
	
	

}
