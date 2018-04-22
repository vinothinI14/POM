package dailyChallenge;

public class StaticAndNoStatic {

	
	static String str1="Hello";
	String str2="World";
	
	public static void chechStatic()
	{
		//System.out.println(str1);
		//System.out.println(str2);
		StaticAndNoStatic var1=new StaticAndNoStatic();
		var1.checkNonStatic();
	}
	public void checkNonStatic()
	{
		System.out.println(str1);
		System.out.println(str2);
	}
	public static void main(String[] args) {
			
		StaticAndNoStatic var=new StaticAndNoStatic();
		chechStatic();
		var.checkNonStatic();
		
	}

}
