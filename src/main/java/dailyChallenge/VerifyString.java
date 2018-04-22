package dailyChallenge;

import java.util.Scanner;

public class VerifyString {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner str=new Scanner(System.in);
		String str1=str.nextLine();
		if(str1.length()==5)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}



