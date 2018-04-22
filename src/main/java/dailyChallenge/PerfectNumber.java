package dailyChallenge;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int n,sum=0;
		System.out.println("Enter the number to find perfect");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		for(int i =1;i<n;i++)
		{
			if(n%i==0)
			{
			sum=sum+i;
				
			}
		}
			
			if(sum==n)
			{
				System.out.println("the given number "+n +"is perfect");
			}
			else
			{
				System.out.println("the given number "+n +"is not a perfect");
			}
		}

	

}
