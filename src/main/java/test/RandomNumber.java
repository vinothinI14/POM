package test;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
	//Using random class
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to find find the random nuber");
		n=s.nextInt();
		
		Random rand=new Random();
		for(i=0;i<=5;i++)
		{
			System.out.println(rand.nextInt(n));
			
			System.out.println(rand.nextDouble());
		}
		
	//Using math class	(math only generate the random of double)
		
		System.out.println(Math.random());
	}
}

