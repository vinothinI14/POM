package splTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord2 {

	public static void main(String[] args) {

		String str="Goodbye bye bye world world world";
		String[] words= str.split(" ");
		ArrayList<String> s=new ArrayList<>();
		for(String word:words)
		{
			s.add(word);
		}
		LinkedHashSet<String> set=new LinkedHashSet<>(s);
		for(String str1:set)
		{
			if(set.add(str1)==false)
			{
				System.out.print(str1+" ");
			}
		}







	}

}
