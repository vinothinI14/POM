package dailyChallenge;

import java.util.Scanner;

public class Largestnumber {
/*
	public static int main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number and Digit");
		Scanner num=new Scanner(System.in);
		int number=num.nextInt();
		int digit=num.nextInt();
		int largeNum=i;
		char c=Integer.toString(digit).charAt(0);
		for(int i=number;i>0;--i)
		{
			if(Integer.toString(i).indexOf(c)==-1)
			{
				return i;
			}
			
		}
System.out.println("The largest number is",i);
	}
	
	*/
	static int getLLessThanN(int number, int digit)
    {
        //Converting digit to char
 
        char c = Integer.toString(digit).charAt(0);
 
        //Decrementing number & checking whether it contains digit
 
        for (int i = number; i > 0; --i)
        {
            if(Integer.toString(i).indexOf(c) == -1)
            {
                //If 'i' doesn't contain 'c'
 
                return i;
            }
        }
 
        return -1;
    }
 
    public static void main(String[] args)
    {
        System.out.println(getLLessThanN(123, 2));
 
        System.out.println(getLLessThanN(4582, 5));
 
        System.out.println(getLLessThanN(98512, 5));
 
        System.out.println(getLLessThanN(548624, 8));
    }
}
