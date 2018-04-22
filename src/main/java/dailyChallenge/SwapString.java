package dailyChallenge;

import java.util.Scanner;

public class SwapString {
public static void main(String[] args) {
	
	String str1,str2;
	System.out.println("Enter 1st string");
	Scanner swap=new Scanner(System.in);
	str1=swap.nextLine();
	System.out.println("Enther the 2nd String");
	str2=swap.nextLine();
	str1=str1+str2;
	str2=str1.substring(0,str1.length()-str2.length());
	System.out.println(str2);
	str1=str1.substring(str2.length());
	System.out.println("First String ="+str1 + "Second string ="+str2);
	
}
}
