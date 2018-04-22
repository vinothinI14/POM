package dailyChallenge;

import java.util.Scanner;

public class FourMatrix {
	// Function print matrix in spiral form
	public static void spiral(int er,int ec,int a[][])
	{
		int i=0,sr=0,sc=0;
		/*  sr - starting row index
        er - ending row index
        sc - starting column index
        ec - ending column index
        i - iterator
        */
		while (sr<er&&sc<ec)
		{
			// Print the first row from the remaining rows
			for(i=sc;i<ec;++i)
			{
				System.out.print(a[sr][i]+" ");
			}
			sr++;
			
			 // Print the last column from the remaining columns 
			for(i=sr;i<er;++i)
			{
				System.out.print(a[i][ec-1]+" ");
			}
			ec--;
			
			// Print the last row from the remaining rows */
			if(sr<er)
			{
				for(i=ec-1;i>=1;--i)
				{
					System.out.print(a[er-1][i]+" ");
				}
				er--;
			}
			
			 // Print the first column from the remaining columns */
			if(sc<ec)
			
			{
				for(i=er-1;i>=sr;--i)
				{
					System.out.print(a[i][sc]+" ");
				}
				sc++;
			}
		}
	}

	public static void main(String[] args) {
		
int r=4,c=4;
int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
spiral(r,c,a);
	}

}
