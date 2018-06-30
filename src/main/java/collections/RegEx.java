package collections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegEx {
@Test
public void expression() {
	/*String cardNo ="1234 4566 9876 0007";
	String pattern = "\\d{4,}\\s*";
	Pattern p = Pattern.compile(pattern);
	Matcher m = p.matcher(cardNo);
	while(m.find()) {
	System.out.print(m.group()+" ");
	String t = m.group();
	Matcher m1 = p.matcher(t);
	System.out.println(m1.matches());
	}*/
	
	
	/*String cardNo="1234 4565 4566 6788";
	String pattern = "\\d{4,}\\s\\d{4}\\s\\d{4}\\s\\d{4}";
	Pattern P = Pattern.compile(pattern);
	Matcher M = P.matcher(cardNo);
	System.out.println(M.matches());*/
	
	
	String email = "angappan@nttdata.com";
	String patternEmail = "\\w{7,20}[@]\\w{5,10}[.]\\w{3}";
	
	Pattern mail = Pattern.compile(patternEmail);
	Matcher matcherMail = mail.matcher(email);
	System.out.println(matcherMail.matches());
	
	
	
}
}
