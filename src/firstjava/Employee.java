package firstjava;

public class Employee {
	static int employeeId;
	String employeeName;
	float salary;
	int experience;
	char grade;
	String status;
	
	void display() {
		System.out.println("Employee ID:-"+employeeId);
		System.out.println("EmployeeName:-"+employeeName);
		System.out.println("Salary:-"+salary);
		System.out.println("Experience:-"+experience);
		System.out.println("Status:-"+status);


	}
	{
		employeeId++;
	}

	public static void main(String[] args) {
		Employee employee1= new Employee();
	
		employee1.employeeName="Swaroop";
		employee1.experience=5;
		employee1.salary=45000.0f;
		employee1.status="Permenent";
		employee1.grade='A';
		employee1.display();
		
		System.out.println("***************************");
		
		
		Employee employee2= new Employee();
		
		employee2.employeeName="BhAAi";
		employee2.experience=10;
		employee2.salary=145000.0f;
		employee2.status="Permenent";
		employee2.grade='O';
		employee2.display();
		
		System.out.println("***************************"); 
        Employee employee3= new Employee();
		
        employee3.employeeName="Boss";
        employee3.experience=15;
        employee3.salary=245000.0f;
        employee3.status="Permenent";
        employee3.grade='O';
        employee3.display();



	}

}
