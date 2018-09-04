package staticexercise;

public abstract class Employee {	
	
	public static void main(String[] args) {
		Employee emp = new PEmployee();
		emp.getEmpSalery();
		emp.getEmpName();
		Employee emp1 = new CEmployee();
		emp1.getEmpSalery();
		emp1.getEmpName();
	}
	public String getEmpName() {
		System.out.println("Name Of The Employee");
		return "Name Of The Employee";
	}	
	public abstract Double getEmpSalery();

}
