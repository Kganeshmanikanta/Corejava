package firstjava;

public class StudentsDetails {
	String studentName;
	int age;
	int admissionYear;
	int rollNo;
	long mobileNumber;
	int attendance;
	float fees;
	char grade;
	String status;
	long studentId;
	float feePaid;
	
	void displayStudentDetails() {
		System.out.println("Student Id:-"+studentId);
		System.out.println("Student Name:-"+studentName);
		System.out.println("Student RollNo:-"+rollNo);
		System.out.println("Student Age:-"+age);
		System.out.println("Student Admission Year:-"+admissionYear);
		System.out.println("Student Conatact No:-"+mobileNumber);
		System.out.println("Student Attendence %:-"+attendance);
		System.out.println("Student Grade:-"+grade);
		System.out.println("Student Total Fees:-"+fees);
		System.out.println("Student Paid Fee:-"+feePaid);
		System.out.println("Student Status:-"+status);
		System.out.println();


	}

	public static void main(String[] args) {
		StudentsDetails student1=new StudentsDetails();
		System.out.println("**********Student Details**********");
		student1.studentId=22030312405993454L;
		student1.studentName="bhAAi";
		student1.rollNo=22;
		student1.age=22;
		student1.admissionYear=2022;
		student1.mobileNumber=9898984556L;
		student1.attendance=89;
		student1.grade='A';
		student1.fees=75000;
		student1.feePaid=70000;
		student1.status="Active";
		
		
		student1.displayStudentDetails();
		System.out.println("**********Student Details**********");
		student1.studentId=22030312467048590L;
		student1.studentName="Boss";
		student1.rollNo=72;
		student1.age=23;
		student1.admissionYear=2021;
		student1.mobileNumber=6305678903L;
		student1.attendance=98;
		student1.grade='o';
		student1.fees=67000;
		student1.feePaid=67000;
		student1.status="Active";
		
		student1.displayStudentDetails();

	}

}
