package test;

import java.util.Scanner;

public class Convertion {

	public static void main(String[] args) {
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the decimal number to conver");
		number=s.nextInt();
		System.out.println("Conevert decimal to binary");
		String binary=Integer.toBinaryString(number);
		System.out.println(binary);
		System.out.println("Conevert decimal to Octal");
		String octal=Integer.toOctalString(number);
		System.out.println(octal);
		System.out.println("Conevert decimal to HexaDecimal");
		String hexa=Integer.toHexString(number);
		System.out.println(hexa);
		
	}	

}



