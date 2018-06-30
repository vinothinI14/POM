package test;

import java.util.Scanner;

public class FlyodTraingle {

	public static void main(String[] args) {
		int row,col,number,num=1;
		System.out.println("Enter the number to print the flyod triangle");
		Scanner input=new Scanner(System.in);
		number=input.nextInt();
		for(row=1;row<=number;row++)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
		//Reverse
		for(row=number;row>=number;row--)
		{
			for(col=row;col<=row;col--)
			{
				System.out.print("*"+" ");
				num++;
			}
			System.out.println();
		}
		

	}

}
