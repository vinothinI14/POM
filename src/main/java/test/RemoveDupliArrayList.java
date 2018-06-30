package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDupliArrayList {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<>();
		list.add("java");
		list.add("ja");
		list.add("java");
		list.add(10);
		list.add(12.2);
		list.add(12.2);
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					list.remove(j);
					
				}
			}
		}
		System.out.println("After removing duplicate :"+list);
		HashSet<Object> set=new HashSet<>();
		for(Object ele:list)
		{
			set.add(ele);
		}
		System.out.println("After removing duplicate :"+set);
	}
	
	

}
