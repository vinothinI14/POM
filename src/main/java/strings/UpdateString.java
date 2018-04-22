package strings;

import org.testng.annotations.Test;

public class UpdateString {
	@Test
	public void update() {
		String input = "AB12C";
		char[] charArray = input.toCharArray();
		for(char each : charArray) {
			int val= each;
			each =(char) (val+1);
			System.out.print(each);
		}
	}

}
