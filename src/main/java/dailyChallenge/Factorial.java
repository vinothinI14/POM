package dailyChallenge;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get number from the user
		System.out.println("Enter the number to find the factorial");
		Scanner fact=new Scanner(System.in);
		int n =fact.nextInt();
		System.out.println(n);
		
		//Initialize the variable to store the value
		int result=1;
		
		//Iterate the loop
		for(int i=1;i<=n;i++)
		{
			result=result*i;
			
		}
		System.out.println("The factorial for the given number "+n+" is="+result);
		//perform the factorial operation
		
		
		
	}

	
}
