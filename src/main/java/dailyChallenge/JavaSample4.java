package dailyChallenge;

import java.util.Scanner;

public class JavaSample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Get two input from user
		int input1 ,input2;
		System.out.println("Enter the firs1 number");
		Scanner num=new Scanner(System.in);
		input1=num.nextInt();
		System.out.println("Enter the second number");
		input2=num.nextInt();
		if(input1%3==0)
		{
			System.out.println("The give number is "+input1+"FIZZ");
		}
		if(input2%3==0)
		{
			System.out.println("The give number is "+input2+"FIZZ");
		}
		if(input1%5==0)
		{
			System.out.println("The give number is "+input1+"BUZZ");
		}
		if(input2%5==0)
		{
			System.out.println("The give number is "+input2+"BUZZ");
		}
		if(input1%3==0 && input1%5==0)
		{
			System.out.println("The give number is "+input2+"FIZZBUZZ");
		}
		if(input2%3==0 && input2%5==0)
		{
			System.out.println("The give number is "+input2+"FIZZBUZZ");
		}
		
		else
		{
			System.out.println("The give number is input1="+input1 +"input1="+ input2);
		}
		
	}

}
