package learningjava;


public class TwoDimenssionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int scores[][]= {{10,5},{23,89},{87,78}};

        String familyNameBld[][]= {{"Kandhu","O+ve"},{"Malli","a+ve"},{"Vinoth","O+ve"},{"Vino","b+ve"}};

		for(int i=0;i<scores.length;i++)
		{
			for(int j=0;j<scores[i].length;j++)
			{
			System.out.println(scores[i][j]+" ");
			}
	}
		
for(int i=0;i<familyNameBld.length;i++)
		{
			for(int j=1;j<familyNameBld[i].length;j++)
			{
			   
				System.out.println(familyNameBld[i][0]+" "+familyNameBld[i][1]);
				
			}
		}
		char grades[][]= {{'i','c'},{'o','a'},{'s','s'}};
			for(char[] grade1:grades)
			System.out.println(grade1);
			
		}
	}
	
	






