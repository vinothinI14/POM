package learnjava2;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Test Java";
		String str2="Learn Java";
		String str3=new String("Test Java");
		String str4=new String("Watch Java video");
		String str5="Learn Java";
		if(str1==str2)
		{
			System.out.println("The both strings are equal");
		}
		else
		{
			System.out.println("The given string is not equal");
		}
		System.out.println("The given string"+str1.equals(str3));
		System.out.println("The given string "+str2.equals(str5));
		System.out.println("The string ignorecase"+str1.equalsIgnoreCase(str4));
		System.out.println("The given string contains"+str2.contains(str3));
		System.out.println("The given string contains 'ear'"+str2.contains("ear"));
		System.out.println("The given string contains 'a'"+str2.endsWith("a"));
		System.out.println("The given string 'java' replace with 'learn'"+str4.replace("Java","learn"));
		System.out.println("The given string "+str2.toLowerCase());
		System.out.println("The given string "+str2.toUpperCase());
		String str6=str1.concat(str2);
		System.out.println(str6);
		System.out.println(str4.length());
		System.out.println("Index of the char 'a' :"+str1.indexOf('a'));
		System.out.println("char at '3' :"+str1.charAt(3));
	}

}
