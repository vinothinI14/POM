package dailyChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Test;

public class LearnMap {
	
	
	public static void main(String[] args) {
		
		 HashMap<Integer, String> hmap=new HashMap<Integer,String>();
		 
		 hmap.put(21, "Twenty One");
		 hmap.put(41, "Thirty One");
		 hmap.put(31, "Thirty One");
		 
		Map<Integer,String> map=new TreeMap<>(hmap);
		 for(Entry<Integer, String> n:map.entrySet())
		 {
			 
			 System.out.print(n.getKey());
			 System.out.println(n.getValue());
			 
		 }
	
		
	}


}