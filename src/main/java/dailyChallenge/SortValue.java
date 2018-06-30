package dailyChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortValue {
public static void main(String[] args) {
	
	Map<String, Integer> map=new HashMap<>();
	map.put("one", 1);
	map.put("Seventeen", 17);
	map.put("Twelve", 12);
	map.put("Five", 5);
	map.put("Two", 2);
	map.put("Twenty Five", 25);
	
	//Set<Entry<String, Integer>> set = map.entrySet();
	List<Entry<String, Integer>> list= new ArrayList<>(map.entrySet());
	list.sort(Entry.comparingByValue());
	
	for(Entry<String , Integer> value:list)
	{
		System.out.print(value.getKey());
		System.out.println(value.getValue());
	}
	
	
}
}
