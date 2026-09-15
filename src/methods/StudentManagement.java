package methods;

public class StudentManagement {
	int studentId;
	String studentName;
	int age;
	char gender;
	String course;
	static String collegeName;
	int mathsMarks;
	int physicsMarks;
	int chemistryMarks;
	int englishMarks;
	int computerMarks;
	float attendance;
	int totalMarks;
	float percentage;
	char grade;
	float fee;
	float feePaid;
	long phoneNumber;
	String email;
	String status;
	String city;
	boolean isEligible;
	
	void displayStudentDetails() {
		System.out.println("**********Student Details***********");
		System.out.println("Id:-"+studentId);
		System.out.println("Name:-"+studentName);
		System.out.println("Age:-"+age);
		System.out.println("Gender:-"+gender);
		System.out.println("City:-"+city);
		

	}
	void displayAcademicDetails() {
		System.out.println("**********Academic Details**********");
		System.out.println("College Name: "+collegeName);
		System.out.println("Course: "+course);
	}
	
	void  displayContactDetails() {
		System.out.println("**********Contact Details**********");
		System.out.println("PhoneNumber:-"+phoneNumber);
		System.out.println("Gmail:-"+email);
	}
	
	void displayMarks() {
		System.out.println("**********Marks In Each Subject**********");
		System.out.println("Maths:-"+mathsMarks);
		System.out.println("English:-"+englishMarks);
		System.out.println("Physics:-"+physicsMarks);
		System.out.println("Computer:-"+computerMarks);
		System.out.println("Chemistry:-"+chemistryMarks);
	}
	
	void calculateTotalMarks() {
		System.out.println("**********Total Marks**********");
		System.out.println("Total Marks:-"+totalMarks);
	}
	
	void calculatePercentage() {
		System.out.println("**********Percentage**********");
		System.out.println("Percentage:-"+percentage);
	}
	
	void calculateGrade() {
		System.out.println("**********Grade**********");
		System.out.println("Grade:-"+grade);
	}

	void checkPassOrFail() {
		System.out.println("**********Result**********");
		System.out.println("Grade:-"+grade);
		
	}
	
	void checkAttendance() {
		System.out.println("**********Attendance**********");
		System.out.println("Attendence:-"+attendance);
	}
	
	void checkExamEligibility() {
		System.out.println("**********Eligibility**********");
		System.out.println("Eligibility:-"+isEligible);
		
	}
	
	void displayAttendance() {
		System.out.println("**********Attendance**********");
		System.out.println("Attendance:-"+attendance);
		
	}
	void displayFeeStatus() {
		System.out.println("**********Fee Status**********");
		System.out.println("Fee Status:-"+feePaid);
		
	}
	void payFees() {
		System.out.println("**********Fee **********");
		feePaid+=fee;
		System.out.println("Fee :-"+feePaid);
		
	}
	void displayCourseDetails() {
		System.out.println("Course"+course);
	}
	void updatePhoneNumber() {
		phoneNumber=9987786655L;
		System.out.println("Updated Phone Number:-"+phoneNumber);
	}
	void  updateEmail() {
		email="Ganmesh@098gmail.com";
		System.out.println("Updated Email:-"+email);
	}
	
	void displayStudentStatus() {
		System.out.println("Status:-"+status);
	}
	
	void displayResult() {
		System.out.println("Total Marks:"+totalMarks);
		System.out.println("Percentage:"+percentage);
		System.out.println("Grade:"+grade);
	}
	void displayCompleteProfile() {
		displayStudentDetails();
		 displayAcademicDetails();
		 displayContactDetails();
		 displayAttendance();
		 displayStudentStatus();
		 
		
		
	}
	public static void main(String[] args) {
		StudentManagement student1=new StudentManagement();
		student1.studentId=101;
		student1.studentName="Tom";
		student1.age=22;
		student1.gender='M';
		student1.course="CSE";
		student1.mathsMarks=99;
		student1.physicsMarks=97;
		student1. chemistryMarks=99;
		student1. englishMarks=98;
		student1. computerMarks=95;
		student1. attendance=89.9f;
		student1. totalMarks=588;
		student1. percentage=96.6f;
		student1. grade='O';
		student1. fee=0;
		student1. feePaid=29000;
		student1. phoneNumber=98767899900L;
		student1. email="Tommy@6543gmail.com";
		student1. status="Active";
		student1. city="Eluru";
		student1. isEligible=true;
		
		student1.displayStudentDetails();
		student1.displayAcademicDetails();
		student1.displayContactDetails();
		student1.displayMarks();
		student1.calculateTotalMarks();
		student1.calculatePercentage();
		student1.calculateGrade();
		student1.checkPassOrFail();
		student1.checkAttendance();
		student1.checkExamEligibility();
		student1.displayAttendance();
		student1.displayFeeStatus();
		student1.payFees();
		student1.displayCourseDetails();
		student1.updatePhoneNumber();
		student1.updateEmail();
		student1.displayStudentStatus();
		student1.displayResult();
		student1.displayCompleteProfile();
		

	}

}
