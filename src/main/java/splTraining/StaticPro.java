/*package splTraining;

public class StaticPro {
	
	static String name = "Test";

	public StaticPro(){
		name = "TestObject";
	}
	
	public static void main(String[] args){	
		//System.out.println("Name is " + name);
		
		int i = 5, j = 2;
		System.out.println( i % j );
public static void main(String[] args){		
		One o = new Two();
		o.sayHello();
	}
	
}

final class One{
	public void sayHello(){
		System.out.println("Parent Hello");
	}
}

class Two extends One{
	public void sayHello(){
		System.out.println("Child Hello");
	}
	
	public static void main(String[] args){		
		One o = new Two();//Class declared as final cannot extends
		o.sayHello();
	}
	
}

class One1{
	public final void sayHello(){
		System.out.println("Parent Hello");
	}
}

class Two2 extends One1{
	public void sayHello(){ // Method inside the class one as final cannot override 
		System.out.println("Child Hello");
	}
	}


*/