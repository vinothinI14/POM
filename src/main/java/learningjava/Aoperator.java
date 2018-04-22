package learningjava;

public class Aoperator {
	
public static void main(String[] args) {
	
	
	int a=12,b=10;
	//add(a,b);
	System.out.println(add(a,b));
	sub(a,b);
	mul(a,b);
	div(a,b);
}
	
public static int add(int a,int b)
	{
	int c = a+b;
	System.out.println(c);
	return(a+b);
	}
	public static void sub(int a,int b)
	{
	int c = a-b;
	System.out.println(c);
	}
	public static void mul(int a,int b)
	{
	int c = a*b;
	System.out.println(c);
	}
	public static void div(int a,int b)
	{
	int c = a/b;
	System.out.println(c);
	}
}

//private static char[] add() {
	// TODO Auto-generated method stub
	//return null;

/*	if(a>b||a<d)
	{
		System.out.println("a is biggest");
	}
	else if(b>d)
	{
		System.out.println("b is biggest");
	}
	else
	{
	System.out.println("d id biggest");
	}
	if(a==b)
	{
		System.out.println("Same number");
	}
	else
	{
		System.out.println("Different Number");
	}
	
	m=a&b;
	System.out.println("a&b="+m);
	
	m=a|b;
	System.out.println("a|b="+m);
	
	m=a^b;
	System.out.println("a^b="+m);
	
	m=~b;
	System.out.println("a~b="+m);
	
	m=a<<2;
	System.out.println("a<<2="+m);
	
	m=a<<1;
	System.out.println("a>>2="+m);
	
	m=a>>>2;
	System.out.println("a<<2="+m);
}*/




