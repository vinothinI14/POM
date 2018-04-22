package dailyChallenge;

public class SecondMaxArray {

	public static void main(String[] args) {
		
	int array[]= {1,45,67,44,777,87,-67,-211};
	int firstlarge=array[0],secondlarge=array[0];
	for(int i=0;i<array.length;i++)
	{
		System.out.println("The given array is"+	array[i]+"\t");
	}
		for(int i=0;i<array.length;i++)
		{
		if(array[i]>firstlarge)
		{
			secondlarge=firstlarge;
			firstlarge=array[i];
		}
		else if(array[i]>secondlarge)
		{
			secondlarge=array[i];
		}
	}
		System.out.println("the second largest of an array is"+secondlarge);
		}

	}
	

