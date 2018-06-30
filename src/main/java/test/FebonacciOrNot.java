package test;

import java.util.Scanner;

public class FebonacciOrNot {
	public static void main(String[] args) {
		int i,a=0,b=0,c=1,inputNumber;
		System.out.println("Enter the number to  check fibonacci series or not" );
		Scanner s=new Scanner(System.in);
		inputNumber=s.nextInt();
		
		//for(i=1;i<=inputNumber;i++)
		while(c<inputNumber)
		{
			a=b;
			b=c;
			c=a+b;
			//System.out.println(a);
		}
		
		if(c==inputNumber)
		{
			System.out.println("The given number"+inputNumber+"is belongs to fibonacci");
		}
		else
		{
			System.out.println("The given number"+inputNumber+"is not belongs to fibonacci");
		}
		
	}

}
