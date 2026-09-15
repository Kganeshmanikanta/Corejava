package methods;
import java.util.Scanner;

public class EmployeeMethod {
	void displayName(String name){
		System.out.println("Employee Name:-"+name);
		
	}
	void employeeId(int id) {
		System.out.println("Employee ID:-"+id);
	}
	void employeeAge(byte age) {
		System.out.println("Employee Age:-"+age);
	}
	void employeeDepartment(String dept) {
		System.out.println("Employee Department:-"+dept);
	}
	void employeeSalary(double sal) {
		System.out.println("Employee salary:-"+sal);
	}

	public static void main(String[] args) {
		EmployeeMethod emp1=new EmployeeMethod();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.nextLine();
		emp1.displayName(name);
		
		System.out.println("Enter id:");
		int id=sc.nextInt();
		emp1.employeeId(id);
		
		System.out.println("Enter Age:");
		byte age=sc.nextByte();
		sc.nextLine();
		emp1.employeeAge(age);
		
		System.out.println("Enter Department Name: ");
		String dept=sc.nextLine();
		emp1.employeeDepartment(dept);
		
		System.out.println("Enter Salary:");
		double sal=sc.nextDouble();
		emp1.employeeSalary(sal);
		
		sc.close();
		
		

	}

}
