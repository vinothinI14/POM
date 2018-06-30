		package test;
		
		import java.util.Arrays;
		
		public class Anagram {
		
			public static void main(String[] args) {
				String str1="keeP caRm";
				String str2="peek Ramc";
				String strsp1=str1.replaceAll("\\s", "");
				String strsp2=str2.replaceAll("\\s", "");
				boolean status=true;
				if(str1.length()!=str2.length())
				{
					status=false;
				}
				else
				{
					char[] ch1=str1.toLowerCase().toCharArray();
					char[] ch2=str2.toLowerCase().toCharArray();
					Arrays.sort(ch1);
					Arrays.sort(ch2);
					status=Arrays.equals(ch1, ch2);
				}
				if(status)
				{
					System.out.println("The given string "+str1 +"&"+ str2+"are anagram");
				}
				else
					System.out.println("The given string "+str1 +"&"+ str2+"are not anagram");
			}
		
		}
