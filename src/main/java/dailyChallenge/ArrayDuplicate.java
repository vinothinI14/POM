package dailyChallenge;

import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class ArrayDuplicate {
	public static void main(String[] args) {

int nums[]={1,3,2,4,2,5,6,8,7,9,3,4};
System.out.println("Array Duplicates");
Arrays.sort(nums);
for(int i=0;i<nums.length-1;i++)
{
	if(nums[i]==nums[i+1])
	
	{
		System.out.println("The duplicate number is"+nums[i+1]+"at Location"+(i+1));;
	}
}
}
}



/*public class ArrayDuplicate { 
public static void main(String[] args)
{
int[] array = {13,16,57,88,65,67,13,99,67,65,13,87,13};

Set<Integer> set = new HashSet<Integer>();

for(int i = 0; i < array.length ; i++)
{
//If same integer is already present then add method will return FALSE
if(set.add(array[i]) == false)
{
System.out.println("Duplicate element found : " + array[i]);
}
}
}
}

	

*/
