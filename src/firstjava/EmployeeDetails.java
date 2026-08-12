package firstjava;

public class EmployeeDetails {
	
	static String departmentName="Btech";
	static String location="A-block";
	
	int emp_id;
	String name;
	long mobileNumber;
	String email;

	public static void main(String[] args) {
		System.out.println("DepartmentName:-"+departmentName);
		System.out.println("Location:-"+location);
		
		System.out.println("************Object 1************");
		
		EmployeeDetails emp =new EmployeeDetails();
		emp.emp_id=1;
		emp.name="Ganesh";
		emp.mobileNumber=84440954022L;
		emp.email="Ganesh17@gmail.com";
		System.out.println("Employee ID:-"+emp.emp_id);
		System.out.println("Employee Name:-"+emp.name);
		System.out.println("EmployeeMobileNo:-"+emp.mobileNumber);
		System.out.println("EmployeeEmail:-"+emp.email);

		
        System.out.println("************Object 2************");
        System.out.println("DepartmentName:-"+departmentName);
		System.out.println("Location:-"+location);
		
		EmployeeDetails emp1 =new EmployeeDetails();
		emp1.emp_id=2;
		emp1.name="apple";
		emp1.mobileNumber=987658765L;
		emp1.email="apple@gmail.com";
		System.out.println("Employee ID:-"+emp1.emp_id);
		System.out.println("Employee Name:-"+emp1.name);
		System.out.println("EmployeeMobileNo:-"+emp1.mobileNumber);
		System.out.println("EmployeeEmail:-"+emp1.email);
		
		System.out.println("************Object 3************");
        System.out.println("DepartmentName:-"+departmentName);
		System.out.println("Location:-"+location);
		
		EmployeeDetails emp2 =new EmployeeDetails();
		emp2.emp_id=3;
		emp2.name="bannana";
		emp2.mobileNumber=8986789898L;
		emp2.email="bannana@gmail.com";
		System.out.println("Employee ID:-"+emp2.emp_id);
		System.out.println("Employee Name:-"+emp2.name);
		System.out.println("EmployeeMobileNo:-"+emp2.mobileNumber);
		System.out.println("EmployeeEmail:-"+emp2.email);
		
		
		System.out.println("************Object 4************");
		departmentName="Civil";
		location="C-block";
		
        System.out.println("DepartmentName:-"+departmentName);
		System.out.println("Location:-"+location);
		
		EmployeeDetails emp3 =new EmployeeDetails();
		emp3.emp_id=4;
		emp3.name="orange";
		emp3.mobileNumber=6307867878L;
		emp3.email="orange@gmail.com";
		System.out.println("Employee ID:-"+emp3.emp_id);
		System.out.println("Employee Name:-"+emp3.name);
		System.out.println("EmployeeMobileNo:-"+emp3.mobileNumber);
		System.out.println("EmployeeEmail:-"+emp3.email);

		System.out.println("************Object 5************");
		
        System.out.println("DepartmentName:-"+departmentName);
		System.out.println("Location:-"+location);
		
		EmployeeDetails emp4 =new EmployeeDetails();
		emp4.emp_id=5;
		emp4.name="mango";
		emp4.mobileNumber=990393930203L;
		emp4.email="mango@gmail.com";
		System.out.println("Employee ID:-"+emp4.emp_id);
		System.out.println("Employee Name:-"+emp4.name);
		System.out.println("EmployeeMobileNo:-"+emp4.mobileNumber);
		System.out.println("EmployeeEmail:-"+emp4.email);










	}

}
