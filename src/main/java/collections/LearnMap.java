package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class LearnMap {
@Test
public void map()
{
	
	String str="will i suceed in interview";
	//Covert the string to char array
	char [] c= str.toCharArray();
	
	//create an empty map
	Map<Character, Integer> map=new LinkedHashMap<>();
	for(char cr:c)
	{
		if(map.containsKey(cr))
		{
			map.get(cr);
			map.put(cr, map.get(cr)+1);
		}
		else
		{
			map.put(cr, 1);
		}
		
	}
	
	for(Entry<Character, Integer> e: map.entrySet())
	{
		System.out.print(e.getKey()+": ");
		System.out.println(e.getValue());
	}
}
}
