package test;

import java.util.Scanner;

public class LargerNumber {

	public static void main(String[] args) {
		int number,digit;
		System.out.println("Enter the number to find the larger");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		System.out.println("Enter the digit 1-9");
		digit=s.nextInt();
		s.close();
		while(Integer.toString(number).contains(Integer.toString(digit)))
		{
			number--;
		}
		System.out.println("Largest number="+ number);
	}

}
