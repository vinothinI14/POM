package learnjava2;

public class OneToHundPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,count=0;
		//1 to 100 prime number
		for(i=0;i<=100;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count=1;
					break;
				}
			}
				if(count==0);
				{
				System.out.println(i);
				}
			}
	}

}
