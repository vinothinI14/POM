package strings;

import org.testng.annotations.Test;

public class CountDuplicates {
	
	@Test
	public void duplicates() {
		String s = "NTT Data";
		int count =0;
		 char arr[]= s.toCharArray();
		 for(char each_arr : arr) {
			 if(each_arr == 'n') {
				 count++;
			 }
		 }
		 System.out.println(count);
	}

}
