package test;

import java.util.Scanner;

public class SumOfPrime {

	public static void main(String[] args) {
		int number,temp,sum=0;
		for(number=1;number<=10;number++)
		{
			temp=0;
		
			for(int i=2;i<number/2;i++)
			{
				if(number%i==0)
				{
					temp++;
					break;
				}
			}
			if(temp==0&&number!=1)
			{
				sum=sum+number;
				
			}
			
		}
		System.out.println(sum);
	
	}
}


