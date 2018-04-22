package learningjava;

public class MethodOperator {

		int m,a=12,b=10,c,d=10;
	public static void main(String[] args) {
		int a=12,b=10;
		System.out.println(add(a,b));
		System.out.println(sub(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
		
	}
		
	public static int add(int a,int b)
		{
				//c=a+b;
		System.out.println(a+b);
		return(a+b);
		}
		public static int sub(int a,int b)
		{
		//c=a-b;
		System.out.println(a-b);
		return(a-b);
		}
		public static int mul(int a,int b)
		{
		//c=a*b;
		System.out.println(a*b);
		return(a*b);
		}
		public static int div(int a,int b)
		{
		//c=a/b;
		System.out.println(a/b);
		return(a/b);
		}
	}


