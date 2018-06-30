package test;

import java.util.Arrays;

public class NonZeroArray {
	
	public static void nonZeroEnd(int[] input)
	{
		int counter=0;//to store the non zero value
		for(int i=0;i<input.length;i++)
		{
			if(input[i]!=0)
			{
				input[counter]=input[i];
				counter++;
			}
		}
		while(counter<input.length)//Store the zero value
		{
			input[counter]=0;
			counter++;
		}
	System.out.println("Zero at the end");
		System.out.println(Arrays.toString(input));
	}
	public static void nonZeroFront(int[] input)
	{
		int counter=input.length-1;
		for(int i=input.length-1;i>0;i--)
		{
			if(input[i]!=0)
			{
				input[counter]=input[i];
				counter--;
			}
		}
		while(counter>=0)
		{
			input[counter]=0;
			counter--;
		}
		System.out.println("Zero at the Front............");
		System.out.println(Arrays.toString(input));
	}
public static void main(String[] args) {
	
	int [] array1= {1,0,6,0,3,0,};
	int [] array2= {0,43,0,1,2,3,0};
	nonZeroEnd(array1);
	nonZeroEnd(array2);
	
	nonZeroFront(array1);
	nonZeroFront(array2);
}
}
