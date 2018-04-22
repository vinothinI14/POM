package dailyChallenge;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class CheckPassword {
		
	public static void main(String[] args) {
		System.out.println("Enter the password"+"\n"+"Password must contain "+"\n"+"1.Atleast ten Char"+"\n"+"2.Only letters and digit"+
	"\n"+"3.Atleast Two digit and two letters"+"\n"+"4.Atleast one capital letter");
		Scanner pass=new Scanner(System.in);
		String Pass=pass.nextLine();
		if(isValid(Pass))
		{
			System.out.println("Valid Password");
		}
		else
		{
			System.out.println("Invalid password");
		}
		
	}
		public static boolean isValid(String Pass) {
		
			if(Pass.length()<20)
		{
				System.out.println("The password Length"+Pass.length());
				
		}
			else {
				
			
		int count =1;
			
		for(int i=0;i<Pass.length();i++)
			{
			
			
			if(!Character.isLetterOrDigit(Pass.charAt(i)))
			{
				
				System.out.println("not a char");
				return false;
				
			}
			else if(!Character.isDigit(Pass.charAt(i)))
				{
					return false;
				}
			else if(!Character.isUpperCase(Pass.charAt(i)))
					{
						count ++;
						
					
					if(count<2)
					{
						return false;
					}
				}
			}
			}
		return true;		
			}
			
		
	}


