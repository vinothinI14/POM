package dailyChallenge;

import java.util.Scanner;

import org.junit.Test;

public class LowerToUpper {

	@Test
	public void toUpper()
	{
		//String str="vinothini";
		System.out.println("Enter the input string");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] c=str.toCharArray();
		for(char ch:c)
		{
		if(ch>='a' && ch<='z')
		{
			ch+='A'-'a';
			System.out.print(ch);
		}
		}
	}
}
