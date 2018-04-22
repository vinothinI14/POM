package learnjava2;

public class LeranArrayMatrix {

	public static void main(String[] args)
	{
	//Declare the array
	//	int ayyar1[]= {1,2,3,4,5,6,7,8,9,0};
	int array2[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		/*for(int i=0;i<array2.length;i++)
	{
		System.out.println(array2[i]);
	}*/
		/*for(int a=0;a<3;a++)
		{
			for(int b=0;b<4;b++)
			{
				System.out.println(array2[a][b]+"");
			}
			System.out.println();
		}*/
	for(int []array:array2)
		
	{
		for(int arr:array)
		System.out.printf("%4d",arr);
	}
	System.out.println();
}
}

