package dailyChallenge;

import java.util.Scanner;

import org.junit.Test;

public class Fibonacci {
	@Test
	public void fibonacci()
	{
		int a=0,b=0,c=1,sum;
		//to find the fibonacci series for given number
		System.out.println("Enter th number to find the fibonaci series");
		Scanner num=new Scanner(System.in);
		int n=num.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");		
		}
	
	}
	
}
