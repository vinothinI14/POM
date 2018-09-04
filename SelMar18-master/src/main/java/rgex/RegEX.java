package rgex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEX {

	public static void main(String[] args) {
		
		String txt = "testleaf 97543 has 64373 employee";
		String patt = "\\d{4,5}";
		Pattern p = Pattern.compile(patt);
		Matcher m = p.matcher(txt);
		//System.out.println(m.matches());
		while(m.find()) {
			System.out.println(m.group());
		}
		
		
		
		
		
		

	}

}
