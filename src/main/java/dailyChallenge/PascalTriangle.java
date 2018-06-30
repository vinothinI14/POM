package dailyChallenge;

import java.util.Scanner;

import org.junit.Test;

public class PascalTriangle {
	@Test
	public void tri()
	{
		int num=5;
		for(int i=0;i<num;i++)
		{
			for(int k=num;k>i;k--)
			{
			System.out.print(" ");

			}
			int number=1;
		for(int j=0;j<=i;j++)
		{
			System.out.print(number+" ");
			number = number * (i - j) / (j + 1);
			
		}
		System.out.println();
		}
				
	}
		
	}
	
