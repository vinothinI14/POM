package test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DuplicateChar {

	public static void main(String[] args) {
		String str="vinthinivinothinik";
		char[] dc = str.toCharArray();
		Map<Character, Integer> map=new TreeMap<>();
		for(char ch:dc)
		{
			if(map.containsKey(ch))
			{
				map.get(ch);
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}

		}
		System.out.println(map);
		
	}

}
