package constructor;

public class Constructor3 {
	String EmployeeName;
	double sal;
	String CompanyName;
	Constructor3(String Name,double sal,String CompanyName){
		EmployeeName=Name;
		this.sal=sal;
		this.CompanyName=CompanyName;
	}

	public static void main(String[] args) {
		Constructor3 e1= new Constructor3("Ganesh",76565,"Google");
		e1.display();
	}
	void display() {
		System.out.println("Employee Name:"+EmployeeName);
		System.out.println("Employee Salary:"+sal);
		System.out.println("Employee CompanyName:"+CompanyName);


	}

}
