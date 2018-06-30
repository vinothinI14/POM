package test;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class OccurenceArray {
	public static void main(String[] args) {
		
		int [] a= {1,3,4,2,3,1,5,7,5,8,9};
		Map<Integer, Integer> map=new TreeMap<>();
		for(int num:a)
		{
			if(map.containsKey(num))
				
			{
				map.get(num);
				map.put(num, map.get(num)+1);
				
			}
			else
			{
				map.put(num, 1);
			}
		}
		for(Entry<Integer, Integer> e:map.entrySet())
		{
			System.out.print(e.getKey()+" Occurs: ");
			System.out.println(e.getValue());
		}
	}
}
