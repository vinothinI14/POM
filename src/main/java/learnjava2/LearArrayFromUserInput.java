package learnjava2;

import java.util.Scanner;

public class LearArrayFromUserInput {
	public static void main(String[] args)
	{
		//1.get the row and column count from the user
		int newaArray[][]= new int[3][4];
		System.out.println("Enter the row count");
		Scanner gRow=new Scanner(System.in);
		int rows=gRow.nextInt();
		System.out.println("Enter the Column count");
		Scanner gCol=new Scanner(System.in);
				int cols=gRow.nextInt();
	
	//2.Get the rows and colunms value from the user
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<cols;j++)
		{
			System.out.println("Enter the value for rows and column");
			Scanner gValues=new Scanner(System.in);
			newaArray[i][j]=gValues.nextInt();
			
		}
		System.out.println();
	}
	//Print the rows and columns as matrix
	for(int[] toArray:newaArray)
	{
		for(int arr:toArray)
		{
			System.out.printf("%4d",arr);
			
		}
		System.out.println();
	}
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<cols;j++)
		{
			System.out.println(newaArray[i][j]);
			
		}
	}
		System.out.println();
	}
		
}


