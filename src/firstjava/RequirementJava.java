package firstjava;

public class RequirementJava {
	Integer studentId;
	String studentName;
	String gender;
	String branchName;
	static String collegeName="Parul University";
	
	void displayDetails() {
		System.out.println("Student Id:"+studentId);
		System.out.println("Student Name: "+studentName);
		System.out.println("Student Geneder: "+gender);
		System.out.println("Student Branch: "+branchName);
		System.out.println("Student College Name: "+collegeName);

	}

	public static void main(String[] args) {
		RequirementJava student1=new RequirementJava();
		student1.studentId=599;
		student1.studentName="Ganesh ManiKanta";
		student1.gender="Male";
		student1.branchName="CSE";
		
		student1.displayDetails();

		
		
		

	}

}
