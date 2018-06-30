package test;

public class CheckBinary {
	
	public static void binary(int number)
	{
		int temp,ip=number;
		boolean isBinary=true;
		if(ip!=0)
		{
			temp=ip%10;
			if(temp>1)
			{
				isBinary=false;

			}
			else
			{
				ip=ip/10;
			}
		}
		if(isBinary)
		{
			System.out.println("The given number is binary number");
		}
		else
		{
			System.out.println("The given number not a binary number");
		}
	}
	
	public static void main(String[] args) {
		binary(12345);
		binary(10101010);
		binary(1111111);

		int number=234;
		int temp=number%10;
		number=number/10;
		if(temp==1|| temp==0)
		{
			System.out.println("binary number");
		}
		else
		{
			System.out.println("not a binary");
		}
	}

}
