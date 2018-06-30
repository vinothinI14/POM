package learnjava2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int temp=0,number,a = 0;
		System.out.println("Enter the number to check ....");
		Scanner num=new Scanner(System.in);
		number=num.nextInt();
		
		for(a=1;a<=number;a++)
		{
		if(number%a==0)
		{
			temp++;
			
		}
		
		}
		
	if(temp==2)
		
		{
			System.out.println(number+"is prime");
		}
	else
	{
		System.out.println(number+"is not a prime");
	}
	}
}

