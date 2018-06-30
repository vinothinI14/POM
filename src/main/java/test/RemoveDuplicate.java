package test;

import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.util.SystemOutLogger;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,2,4,5,3,4};
		Set<Integer> set=new TreeSet<>();
		for(int i:arr)
		{
			set.add(i);
		}
		System.out.println(set);

	}

}
