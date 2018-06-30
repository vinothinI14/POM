package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {
		
		int [] a= {1,3,3,4,2,5,2,3,45,67,90};
		List<Integer> list=new ArrayList<>();
		for(int num:a)
		{
			list.add(num);
		}
		Collections.sort(list);
		System.out.println(list);
		
		
		//Arrays.sort(a);
		
	}

}
