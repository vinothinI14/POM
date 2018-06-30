package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class InterSection {
	public static void main(String[] args) {
		int a1[]= {1,2,4,5,3,6};
		int a2[]= {2,1,7,6,8};
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					list.add(a1[i]);
				}
			}
		}
		System.out.println(list);



		//Way 2:
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					set.add(a1[i]);
				}
			}
		}
		System.out.println(set);

union(a1,a2);
	}
	static void union(int[] ... inArrays)
	{
		HashSet<Integer> set=new HashSet<>();
		for(int [] inArray:inArrays)
		{
		for(int i:inArray)
		{
			set.add(i);
		}
		System.out.println(set);
	}
}
}