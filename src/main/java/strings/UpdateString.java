package strings;

import org.junit.Test;

public class UpdateString {
	@Test
	public void update() {
		String input = "AB12C",output = "";
		char[] charArray = input.toCharArray();
		for(char each : charArray) {
			int val= each;
			each =(char) (val+1);
			
		output=	output.concat(each+"");
		}
		System.out.println(output);
	}

}
