package dailyChallenge;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		System.out.println("Enter the year");
		Scanner yr=new Scanner(System.in);
		int year=yr.nextInt();
		boolean flag=false;
		if(year%400==0)
		{
			flag=true;
		}
		else if(year%100==0)
		{
			flag=false;
		}
		
		else if(year%4==0)
		{
			flag=true;
		}		
		if(flag)
		{
			System.out.println("The given year"+year+"is leap year");
		}
		else
		{
			System.out.println("The given year"+year+"is not leap year");
		}
}
}
