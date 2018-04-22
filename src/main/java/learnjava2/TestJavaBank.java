package learnjava2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TestJavaBank {
	
	public String name;
	private int accountNumber;
	String city;
	protected String mobileNumber;
	public void addName() {
		System.out.println("Ente the account owner name");
	Scanner bank= new Scanner(System.in);
	name=bank.nextLine();
	System.out.println(name);
	}
	private void accNum()
	{
		System.out.println("Enter the unique account number");
		Scanner bank= new Scanner(System.in);
		accountNumber=bank.nextInt();
		System.out.println(accountNumber);
	}
	void city()
	{
		System.out.println("Enter the current city");
		Scanner bank= new Scanner(System.in);
		city=bank.nextLine();
		System.out.println(city);
	}
	
	protected void mblNum()
	{
		System.out.println("Enter the correct mobile number");
		Scanner bank= new Scanner(System.in);
		mobileNumber=bank.nextLine();
		System.out.println(mobileNumber);
	}

}
class TestJavaB  extends TestJavaBank
{
	public static void main(String[] agrs)
	{
		TestJavaBank account =new TestJavaBank();
		account.addName();
		//account.accNum();
		account.city();
		account.mblNum();
	
		
	}
}

