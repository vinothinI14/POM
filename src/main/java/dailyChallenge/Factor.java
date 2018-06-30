package dailyChallenge;

public class Factor {

	static int inNum=5, fact=1;
	public void fact()
	{
		
		for(int i=1;i<=inNum;i++)
		{
			fact=fact*i;
		}
		System.out.println("The fact of given number"+ inNum +"="+fact);
	}
	
	public static void factStatic()
	{
		for(int i=2;i<inNum;i++)
		{
			if(inNum%2==0)
			{
				System.out.println("not prime");
			}	
			else
				{
				for(int j=1;j<=inNum;j++)
				{
					fact=fact*i;
				}
			}
		}
		System.out.println("The fact of given number"+ inNum +"="+fact);
	}


	public static void main(String args[])
	{
		Factor ft=new Factor();
		ft.fact();
		ft.factStatic();
	}
}