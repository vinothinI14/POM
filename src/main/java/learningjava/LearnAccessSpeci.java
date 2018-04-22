package learningjava;

import java.util.Scanner;

public class LearnAccessSpeci {
	public static String name;
    private int age;
    static String gender;
    
public void StudentDetails()
{
	System.out.println("Enter the name of the student");
	Scanner std=new Scanner(System.in);
	name =std.nextLine();
	System.out.println(name);
	System.out.println("Enter the age of the student");
	age=std.nextInt();
	System.out.println(age);
	System.out.println("Enter the gender of the student");
	gender=std.nextLine();
	System.out.println(gender);

}    
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Student stu=new Student();
	stu.Attendence();
	
	
}

}
class Student extends LearnAccessSpeci 
{
public void Attendence()
{
	System.out.println("Enter the name of the student");
	Scanner std=new Scanner(System.in);
	name =std.nextLine();
	System.out.println(name);
	System.out.println("Enter the gender");
	gender=std.nextLine();
	System.out.println(gender);
}

/*public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Student stu=new Student();
	stu.Attendence();
	
	
}*/

}
