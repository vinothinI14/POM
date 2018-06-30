package splTraining;

public class ComOfWord2 {

	public static void permutation(int n, char ch[], char ch1[])
	{
		if(n<=0)
		{
			System.out.print(String.valueOf(ch1)+ " ");
		}
		else
		{
			for(int i=0 ;i<ch.length;i++)
			{
				ch1[n-1]=ch[i];
				permutation(n-1,ch,ch1);
			}
		}	
	}
	
	public static void main(String[] args) {
		String s="Welcome";
		int n=3;
				permutation(n,s.toCharArray(),new char[n]);
			}

}

