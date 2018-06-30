package dailyChallenge;

import org.junit.Test;

public class ProgramDay1 {
	@Test
	public void Star()
	{
		String str1="abcde";
		char[] c=str1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='c')
			{
				System.out.print("c*");
			}
			else
			{
				System.out.print(c[i]);
			}
		}
		
	}
}
