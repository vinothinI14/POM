package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashtoAList {

	public static void main(String[] args) {
		HashMap<String, Integer> hMap=new HashMap<>();
		hMap.put("vino", 100);
		hMap.put("Suvi", 101);
		hMap.put("Suba", 99);
		hMap.put("vinoth", 100);
		//Set<Entry<String, Integer>>  entrySet=hMap.entrySet();
		ArrayList<Entry<String, Integer>> list=new ArrayList<Entry<String,Integer>>(hMap.entrySet());
		for(Entry<String, Integer>e:list)
		{
			System.out.print(e.getKey()+" "+e.getValue() );
		}
	}

}
