package test;

import java.util.Scanner;

public class ReverseCheckPali {
public static void main(String[] args) {
	
	String rev="",str;
	System.out.println("Enter the String to find the palindrom");
	Scanner s=new Scanner(System.in);
	str=s.nextLine();
	int len=str.length();
	char[] c = str.toCharArray();
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+c[i];
		System.out.println(rev);
	}
	if(str.equals(rev))
	{
		System.out.println("Palindrom");
	}
	else
		System.out.println("not Palindrom");
}
}

