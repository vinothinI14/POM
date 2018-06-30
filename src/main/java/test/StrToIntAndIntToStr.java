package test;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class StrToIntAndIntToStr {

	public static void main(String[] args) {
		String str;
		int num;
		System.out.println("Enter the string to convert to integer");
		
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		num = Integer.parseInt(str);
		
		System.out.println(num);
		
		System.out.println(Integer.toString(num));
		System.out.println(Integer.valueOf(num));
		System.out.println(String.valueOf(num));
		
		String str1 = new StringBuffer().append(1234).toString();
		System.out.println(str1);

	}

}
