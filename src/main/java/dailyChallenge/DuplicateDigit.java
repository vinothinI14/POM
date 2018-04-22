package dailyChallenge;

import java.util.Scanner;

public class DuplicateDigit {

	public static void main(String[] args) {
int num,temp = 0,n;
			System.out.println("Enter the digits");
			Scanner digit=new Scanner(System.in);
			num=digit.nextInt();
			
			for(int i=1;i<num;i++)
			{n=num;
				while(n!=0)
				{
					if(n%10==i)
					{
						System.out.println(n);;
					}
					n/=10;
				}
				
			}
			

	}

}
