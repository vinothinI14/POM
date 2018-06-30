	package dailyChallenge;
	
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	
	import org.junit.Test;
	
	public class RearrangeDigit {
	
		@Test
		public void ascending()
		{
			int num= 19673;
			List<Integer> inList= new ArrayList<>();
			for(int i=num;i>0;i=i/10)
			{
				
				inList.add(i%10);
				
			}
			Collections.sort(inList);
			/*for(int i: inList)
			{
				Integer.valueOf(i);
			}*/
			System.out.print(inList);
		}
	}
	
