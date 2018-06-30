package splTraining;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		
		String str = "Goodbye bye bye world world world";
		String[] words= str.split(" ");
		/*for(String str1:words)
		{
		System.out.println(str1);
		}*/
		
		for(int i=0;i<words.length;i++)
		{
			if(words[i]!=null)
			{
				for(int j=i+1;j<words.length;j++)
				{
					if(words[i].equals(words[j]))
					{
						words[j]=null;
						//System.out.println(words[j]);
						
					}
					
				}
			}
		}
		
		for(int k=0;k<words.length;k++)
		{
			if(words[k]!=null)
			{
				System.out.print(words[k]+" ");
			}
		}
	}

}
