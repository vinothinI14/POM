package dailyChallenge;

import java.util.Scanner;

public class CodeChanllengeJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2,operation;
		String stroperation;
		String str;
		
		System.out.println("Enter the number 1");
		Scanner num=new Scanner(System.in);
		number1=num.nextInt();
		
		System.out.println("Enter the number 2");
		Scanner num1=new Scanner(System.in);
		number2=num1.nextInt();
		
		/*System.out.println("Enter the String");
		Scanner stri=new Scanner(System.in);
		str=stri.nextLine();*/
		
		System.out.println("Enter the on of Arithmetic operation to perform");
		Scanner stri=new Scanner(System.in);
		str=stri.nextLine();
		
		switch(str)
		{
			case ("add"):
			{
				operation=number1+number2;
				System.out.println(operation);
				break;
			}
			
			case ("sub"):
			{
				operation=number1-number2;
				System.out.println(operation);
				break;
			}	
			case ("Multiple"):
			{
				operation=number1*number2;
				System.out.println(operation);
				break;
			}
			case ("divide"):
			{
				operation=number1/number2;
				System.out.println(operation);
				break;
			}
	}

}

}