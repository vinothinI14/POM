package test;

import java.util.Scanner;

public class SumOfDigits {
	static int sumOfDigi(int inputNumber)
	{
	int reminder,sumofdigit=0;
	
	int number=inputNumber;
	while(inputNumber>0)
	{
		reminder=inputNumber%10;
		sumofdigit=sumofdigit+reminder;
		inputNumber=inputNumber/10;
		
	}
	
	if(sumofdigit>9)
	{
		sumofdigit=sumOfDigi(sumofdigit);
	}
	System.out.println("sumofdigits  "+ number +"is"+ sumofdigit);
	return sumofdigit;
	}
	


public static void main(String[] args) {
sumOfDigi(1234);
sumOfDigi(234);
}
}
