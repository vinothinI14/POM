package splTraining;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDuplicateWordRegex {
	
public static void main(String[] args) {
	

	String str="Goodbye bye bye world world world";
	String reg="\\b(\\w+)(\\s+\\1\\b)+";
	Pattern p=Pattern.compile(reg,Pattern.CASE_INSENSITIVE);
	Matcher match=p.matcher(str);
	while (match.find())
	{
		str=str.replaceAll(match.group(), match.group(1));
	}
	System.out.println(str);
}
}
