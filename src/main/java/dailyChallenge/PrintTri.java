package dailyChallenge;

import java.util.Scanner;

public class PrintTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		System.out.println("enter the number of rows");
		Scanner row=new Scanner(System.in);
		int num=row.nextInt();
	for(int i=0;i<num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(n+" ");
			n++;
			}
			System.out.print("\n");
		}
	for(int i=num;i<=num;i--)
	{
		for(int j=num;j<=i;j--)
		{
			System.out.print("*");
			
		}
	System.out.println("\n");
	}
	}

}
