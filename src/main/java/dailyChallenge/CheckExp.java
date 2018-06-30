package dailyChallenge;

import org.junit.Test;
public class CheckExp {

	
	public static void main(String[] args) {
		String specChar = "{Java}/\\*(Selenium)";
		System.out.println(specChar.replaceAll("[^A-Za-z0-9]", "")); // A generic one to replace all special characters
		System.out.println(specChar.replaceAll("[\\W]", "")); // A generic one to replace all special characters
		System.out.println(specChar.replaceAll("[{}()/\\\\]", "").replaceAll("[*]", " "));//A specific one to replace only those present in the example.

	}
	
}

/*public void exp()
{
	String str="{java}/\\*(selenium)";
	String str1=str.replaceAll("\\W", "");
	System.out.println(str1);
*/