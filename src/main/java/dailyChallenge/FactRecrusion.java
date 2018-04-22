package dailyChallenge;

import java.util.Scanner;


public class FactRecrusion {
	
	static Scanner fact=new Scanner(System.in);
	static int n =fact.nextInt();
	
	int fac=1;
	public static int Factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		
		return(n*Factorial(n-1));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Factorial(n);	
		System.out.println(a);
	}
	
	

}
