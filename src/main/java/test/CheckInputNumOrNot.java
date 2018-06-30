package test;

import java.util.Scanner;

public class CheckInputNumOrNot {

	public static void main(String[] args) {
		String number;
		System.out.println("Enter the input number");
		Scanner s=new Scanner(System.in);
		number=s.next();
		try {
			int num=Integer.parseInt(number);
			System.out.println("The given input is an number");
		}	catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
