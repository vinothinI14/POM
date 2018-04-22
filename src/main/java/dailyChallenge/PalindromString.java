package dailyChallenge;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enter the String to check
		String str,rev="";
		System.out.println("Enter the String");
		Scanner stri=new Scanner(System.in);
		str=stri.nextLine();
		//Find the String length
		int length=str.length();
		//Use the loop to reverse the string
		for(int i=length-1;i>0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		//	Check the given string is palindrome or not
		if(str.equals(rev))
		{
			System.out.println("the given string is palindrome");
			
		}
		else
		{
			System.out.println("The given string not a palindrome");
		}
	}

}
