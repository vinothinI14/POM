package test;

import java.util.Scanner;

public class PrintNumWithoutLoop {
	
	public static void main(String[] args) {
		print(1);
}
public static void print(int number)
{
	if(number<=100)
	{
		System.out.println(number);
		number++;
		print(number);
		
	}
	
}

}