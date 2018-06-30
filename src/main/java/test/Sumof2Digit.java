package test;

import java.util.Scanner;

public class Sumof2Digit {
	public static void main(String[] args) {
		int sum=0,rem,num;
		System.out.println("Enter the two digit number");
		Scanner  s=new Scanner(System.in);
		num=s.nextInt();
		
		for(int i=0;i<2;i++)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
		
	}

}
