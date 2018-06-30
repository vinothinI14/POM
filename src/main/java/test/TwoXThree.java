package test;

import java.util.Scanner;

public class TwoXThree {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows in the first matrix");
		Scanner sc=new Scanner(System.in);
		int rowFirst=sc.nextInt();
		
		System.out.println("Enter the number of col in first matrix /row in second matrix");
		int colRow=sc.nextInt();
		
		System.out.println("Enter the number of column in second matrix");
		int colInSecond=sc.nextInt();
		
		int[][] matrix1=new int[rowFirst][colRow];
		int[][] matrix2=new int[colRow][colInSecond];
		int[][] product=new int[rowFirst][colInSecond];
		System.out.println("Enter the data for first matrix");
		for(int i=0;i<rowFirst;i++)
		{
			for(int j=0;j<colRow;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the data for second matrix");
		for(int i=0;i<colRow;i++)
		{
			for(int j=0;j<colInSecond;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		System.out.println("The first matrix");
		for(int i=0;i<rowFirst;i++)
		{
			for(int j=0;j<colRow;j++)
			{
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("The first matrix");
		for(int i=0;i<colRow;i++)
		{
			for(int j=0;j<colInSecond;j++)
			{
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Product----");
		for(int i=0;i<colRow;i++)
		{
			for(int j=0;j<colInSecond;j++)
			{
				for(int k=0;k<colRow;k++)
				{
					product[i][j]=matrix1[i][k]*matrix2[k][j];	
				}
			}
		}
		for(int i=0;i<colRow;i++)
		{
			for(int j=0;j<colInSecond;j++)
			{
				System.out.print(product[i][j]+"\t");
			}
			System.out.println();
		}

}
}