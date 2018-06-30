package test;

public class ReverseResWhiteSpace {
	public static void main(String[] args) {
		String str="I am";
		char[] ipStr=str.toCharArray();//Covert string to array
		char[] resStr=new char[ipStr.length];//Store the space
		for(int i=0;i<ipStr.length;i++)
		{
			if(ipStr[i]==' ')
			{
				resStr[i]= ' ';
			}
		}
		int j=resStr.length-1;//Non white space 
		for(int i=0;i<ipStr.length;i++)
		{
			if(ipStr[i]!=' ')
			{
				if(resStr[j]==' ')
				{
					j--;
				}
			resStr[j]=ipStr[i];
			j--;
		}
	}
System.out.println("Reverse String with white space----"+ String.valueOf(resStr));

}
}