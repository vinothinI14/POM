package dailyChallenge;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter 1st number");
		Scanner swap=new Scanner(System.in);
		a=swap.nextInt();
		System.out.println("Enther the 2nd number");
		b=swap.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The swapping of two number is a="+a    +"b="+b);
		
	}

}
