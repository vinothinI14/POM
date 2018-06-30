package dailyChallenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class UsPattren {
@Test
public void usPat()
{
	 String input = "+1(123)-423-72345";
	 String pattern="[+][1][(]\\d{3}[)]-\\d{3}-\\d{5}";
	
	 Pattern  p= Pattern.compile(pattern);
	 Matcher match=p.matcher(input);
	 System.out.println(match.matches());
	 
}
}
