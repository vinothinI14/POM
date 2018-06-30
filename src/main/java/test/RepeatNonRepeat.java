package test;

import java.util.HashMap;

public class RepeatNonRepeat {

	public static void main(String[] args) {
		String str="Vinothini";
		HashMap<Character, Integer> map=new HashMap<>();
		char ch[]=str.toCharArray();
		
		for(char c:ch)
		{
			if(map.containsKey(c)) {
				map.put(c,(map.get(c)+1));
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		//Check non repeat character
		for(char c:ch)
		{
			if(map.get(c)==1)
			{
				System.out.println("Non repeated char"+c);
				break;
			}
		}
		
		//Check repeated char
		for(char c:ch)
		{
			if(map.get(c)>1)
			{
				System.out.println("repeated char"+c);
				break;
			}
		}
	}
}
