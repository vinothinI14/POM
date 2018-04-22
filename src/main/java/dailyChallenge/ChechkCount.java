package dailyChallenge;

public class ChechkCount {

	public static void main(String[] args) {
		String input="I Love Hardly davidson 1 Bike @ my childhood";
		int digit=0,upper=0,lower=0,special=0,len=input.length(),temp = 0;
					System.out.println(len);
		for(int i=0;i<input.length();i++)
		{
			if(Character.isUpperCase(input.charAt(i))) 
				upper++;
			else if(Character.isLowerCase(input.charAt(i)))
				lower++;
			else if(Character.isDigit(input.charAt(i)))
				digit++;
			else
				special++;
		}
System.out.println("The count of upper case"+(float)upper*100/len+"%");
System.out.println("The count of lower case"+(float)lower*100/len+"%");
System.out.println("The count of digit case"+(float)digit*100/len+"%");
System.out.println("The count of upper case"+(float)special*100/len+"%");
	}

}
