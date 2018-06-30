package dailyChallenge;

import java.util.Scanner;

import org.junit.Test;

public class VowelsCount {
	
	@Test
	public void vowels()
	{
		int i,count = 0;
		String str;
		System.out.println("Enter the string");
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		char[] c= str.toCharArray();
		for(i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
