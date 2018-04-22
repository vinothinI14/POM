package learningjava;

import java.util.Scanner;

public class Palindrom {
public static void main(String[] args) {
	int number,temp,sum=0,reminder;
	Scanner num =new Scanner(System.in);
	System.out.println("enter the number to find the palindrom");
	number=num.nextInt();
	temp=number;
	while(number>0)
	{
		reminder=number%10;
		sum=sum*10+reminder;
		number=number/10;
	}
	if(temp==sum)
	{
		System.out.println("The given number"+ temp+"Palindrom" );
	}
	else
	{
		System.out.println("The gien number not a palindrom");
	}
}
}
