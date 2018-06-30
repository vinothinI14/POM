package test;

import java.util.Scanner;

public class SwapWithouVar {
	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the numbers to be swapped");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Number after swapping"+"a="+a+"b="+b);
	}

}
