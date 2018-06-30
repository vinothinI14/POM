package test;

import java.util.LinkedHashMap;

public class LongSubString {

	public static void main(String[] args) {
		String str="vinothini";
		char [] longChar=str.toCharArray();
		System.out.println(longChar);
		String longSunString=null;
		int longStringLen=longChar.length;
		System.out.println(longStringLen);
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		for(int i=0;i<longStringLen;i++)
		{
			char ch=longChar[i];
			{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				i=map.get(ch);
				map.clear();
			}
			if(map.size()>longStringLen)
			{
				longStringLen=map.size();
				longSunString=map.keySet().toString();
			}
		}
		}
		System.out.println("Longest substring :" +longSunString);
		System.out.println("Longet substring lenght"+longStringLen);

	

}
}