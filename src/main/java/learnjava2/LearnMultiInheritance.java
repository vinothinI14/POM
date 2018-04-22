package learnjava2;

import java.util.Scanner;

public class LearnMultiInheritance {

	public String companyName;
	String cName=companyName;
	public void  cName()
	{
		System.out.println("Enter the company");
		Scanner emp=new Scanner(System.in);
		companyName=emp.nextLine();
		System.out.println(companyName);
		
	}
}
class B extends LearnMultiInheritance
{
	private int salary;
	void sal()
	{
		System.out.println("Enter the salary");
		Scanner emp=new Scanner(System.in);
		salary=emp.nextInt();
		System.out.println(salary);
		System.out.println(cName);
		
	}
	public void cName()
	{
		/*System.out.println("Enter the company");
		Scanner emp=new Scanner(System.in);
		companyName=emp.nextLine();*/
		System.out.println("tcs");
		
	}
}
class C extends B
{
	protected String dealName;
	void dName()
	{
		System.out.println("Enter the Deal name");
		Scanner emp=new Scanner(System.in);
		dealName=emp.nextLine();
		System.out.println(dealName);
		System.out.println(cName);
		
	}
	
}
class D
{
	public static void main(String[] args)
	{
		LearnMultiInheritance mul =new LearnMultiInheritance();
		mul.cName();
		C dn=new C();
		dn.dName();
		
		B s = new B();
		s.sal();
		s.cName();
		
		
	}
}