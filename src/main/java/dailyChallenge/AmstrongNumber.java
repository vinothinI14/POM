package dailyChallenge;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {

	int inputNumber,reminder,sumofdigit=0;
	Scanner num = new Scanner(System.in);
	System.out.println("enter the number");
	inputNumber=num.nextInt();
	int number=inputNumber;
	while(inputNumber>0)
	{
		reminder=inputNumber%10;
		sumofdigit=sumofdigit+(reminder*reminder*reminder);
		inputNumber=inputNumber/10;
		
	}
System.out.println("sumofdigits  "+ number +"is"+ sumofdigit);
if(number==sumofdigit)
{
	System.out.println("The given number"+number+ "is Amstrong number");
}
else
	System.out.println("The given number"+number+ "is not a Amstrong number");
	}
	
		
}
