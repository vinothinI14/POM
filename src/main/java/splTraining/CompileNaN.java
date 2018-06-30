package splTraining;

import com.google.common.base.Ascii;

public class CompileNaN {

	public static void main(String[] args) {

		//Nan	
		double d1 = Double.NaN;		
		double d2 = d1;

		System.out.println(d1 +""+d2);

		if(d1 == d2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");

		//ASCII add ' '
		int i = 10;
		int j = 25;
		int ascii=' ';
		System.out.println(ascii);
		System.out.println(i + ' ' + j);
		
		//Octal
		int i1 = 010;
		System.out.println(i1);
		
		//Byte 
		byte b1 = 5, b2 = 2;
		byte b = (byte) (b1 % b2);
		System.out.println(b);
		
		//boolean comparison( we cannot use equals i primitive data type boolean
		boolean b3 = true;
		boolean b4 = true;

		if(b3 == b4){
			System.out.print("==");
		}

		/*if(b3.equals(b4)){
			System.out.print("equals");
		}*/
		
		//Arrray 
		int array[] = new int[1];
		array[0] = 100;

		System.out.println(array.length);
		
		//float and double comp
		float f = (float) 10.2;
		System.out.println(f);
		double d = 10.2;
		
		if(f == d)
			System.out.println("Same");
		else
			System.out.println("Not same");
		
		//Null to int
//		double i3 = 5, j3 = null;
	//	System.out.println( i % j );
		
		String str= "good";
		str=str+"morninig";
		System.out.println(str);
		
		StringBuffer str1 = new StringBuffer("Good"); 
		str1.append(" Morning");
		System.out.println(str1);
		
	}

}

