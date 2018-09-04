package staticexercise;

public class LearnStatic {
	String txtx;
	int number=10;
	static int number1;	
	static {
		System.out.println("static Block");
		number1 = 11;
	}
	public static void main(String[] args) {
		LearnStatic ls = new LearnStatic();
		ls.counter();
		ls.counter();
		
		LearnStatic ls1 = new LearnStatic();
		ls1.counter();
		name();		
	}

	public void counter(){
		number++;
		number1++;
		System.out.println("non static :"+number);
		System.out.println("static :"+number1);
	}
	
	public static void  name() {
		System.out.println("Static Function");
		
	}

	
	
	
	
	
	
	
	
	

}
